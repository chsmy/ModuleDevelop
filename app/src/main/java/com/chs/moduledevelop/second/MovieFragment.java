package com.chs.moduledevelop.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chs.library.base.BaseFragment;
import com.chs.library.util.LogUtils;
import com.chs.moduledevelop.R;
import com.chs.moduledevelop.net.DataManager;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class MovieFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    Unbinder unbinder;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;
    private String mSearchName = "";
    private int mStart;
    private BookAdapter mAdapter;
    private List<BookEntity.BooksEntity> mList = new ArrayList<>();
    public static MovieFragment newInstance(Bundle bundle) {
        MovieFragment fragment = new MovieFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, null);
        unbinder = ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(layoutManager);
        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                mStart = 0;
                initData();
            }
        });
        mRefreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                initData();
            }
        });
        mAdapter = new BookAdapter(R.layout.item_book_adapter,mList);
        mRecyclerview.setAdapter(mAdapter);
    }

    @Override
    protected void onVisible() {
        super.onVisible();
        mSearchName = getArguments().getString("searchName");
        if (isAdded()) {
            createLoadingDialog(getContext(), getString(R.string.loading));
        }
        initData();
    }

    private void initData() {
        DataManager.getInstance().getBookList(new Observer<BookEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(BookEntity bookEntity) {
                mRefreshLayout.finishRefresh();
                mRefreshLayout.finishLoadmore();
                mList.addAll(bookEntity.getBooks());
                mAdapter.notifyDataSetChanged();
                mStart+=10;
                LogUtils.i("mStart",mStart+"");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                finishDialog();
            }
        }, mSearchName, mStart, 10);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

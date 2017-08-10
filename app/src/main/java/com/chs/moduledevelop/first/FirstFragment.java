package com.chs.moduledevelop.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chs.library.base.BaseFragment;
import com.chs.library.base.adapter.BaseQuickAdapter;
import com.chs.moduledevelop.R;
import com.chs.moduledevelop.net.DataManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class FirstFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;
    Unbinder unbinder;
    private List<MovieSection> mData;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, null);
        unbinder = ButterKnife.bind(this, view);
        initData();
        initView();
        initEvent();
        return view;
    }

    private void initEvent() {

    }

    private void initView() {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        mRecyclerView.setLayoutManager(layoutManager);

    }

    private void initData() {
        createLoadingDialog(getContext(),getString(R.string.loading));
        Observable.zip(DataManager.getInstance().getHeatMovieObservable(0, 6), DataManager.getInstance().getComingMovieObservable(0, 6),
                new BiFunction<HeatMovieEntity, HeatMovieEntity, List<MovieSection>>() {
                    @Override
                    public List<MovieSection> apply(HeatMovieEntity heatMovieEntity, HeatMovieEntity heatMovieEntity2) throws Exception {
                        mData = new ArrayList<MovieSection>();
                        mData.add(new MovieSection(true, "热门电影"));
                        for (HeatMovieEntity.SubjectsEntity s : heatMovieEntity.getSubjects()) {
                            mData.add(new MovieSection(s));
                        }
                        mData.add(new MovieSection(true, "即将放映"));
                        for (HeatMovieEntity.SubjectsEntity s : heatMovieEntity2.getSubjects()) {
                            mData.add(new MovieSection(s));
                        }
                        return mData;
                    }
                }).subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<MovieSection>>() {
            @Override
            public void accept(List<MovieSection> o) throws Exception {
                finishDialog();
                SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_first_content, R.layout.item_first_header, mData);
                sectionAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                        MovieSection mySection = mData.get(position);
                        if (mySection.isHeader)
                            Toast.makeText(getContext(), mySection.header, Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getContext(), mySection.t.getTitle(), Toast.LENGTH_LONG).show();
                    }
                });
                sectionAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
                    @Override
                    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                        Toast.makeText(getContext(), "onItemChildClick" + position, Toast.LENGTH_LONG).show();
                    }
                });
                mRecyclerView.setAdapter(sectionAdapter);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

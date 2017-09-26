package com.chs.moduledevelop.first;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.chs.library.base.BaseFragment;
import com.chs.library.base.adapter.BaseQuickAdapter;
import com.chs.library.util.StatusBarUtil;
import com.chs.moduledevelop.R;
import com.chs.moduledevelop.net.DataManager;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class FirstFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;
    Unbinder unbinder;
    @BindView(R.id.home_banner)
    Banner mHomeBanner;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_first;
    }

    @Override
    public void finishCreateView(Bundle state) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        mRecyclerView.setLayoutManager(layoutManager);
        StatusBarUtil.setTransparentForImageViewInFragment(getActivity(),mToolbar);
        loadData(true);
    }

    @Override
    protected void loadData(boolean isShowLoading) {
        super.loadData(isShowLoading);
        Observable.zip(DataManager.getInstance().getHeatMovieObservable(0, 6), DataManager.getInstance().getComingMovieObservable(0, 6)
                , DataManager.getInstance().getBannerListObservable(), new Function3<HeatMovieEntity, HeatMovieEntity, BannerEntity, FirstPageEntity>() {
                    @Override
                    public FirstPageEntity apply(HeatMovieEntity heatMovieEntity, HeatMovieEntity heatMovieEntity2, BannerEntity bannerEntity) throws Exception {
                        FirstPageEntity entity = new FirstPageEntity();
                        List<MovieSection> sections = new ArrayList<MovieSection>();
                        sections.add(new MovieSection(true, "热门电影"));
                        for (HeatMovieEntity.SubjectsEntity s : heatMovieEntity.getSubjects()) {
                            sections.add(new MovieSection(s));
                        }
                        sections.add(new MovieSection(true, "即将放映"));
                        for (HeatMovieEntity.SubjectsEntity s : heatMovieEntity2.getSubjects()) {
                            sections.add(new MovieSection(s));
                        }
                        List<String> banner = new ArrayList<String>();
                        for (BannerEntity.ListEntity e : bannerEntity.getList()) {
                            banner.add(e.getImage_url_big());
                        }
                        entity.setBanners(banner);
                        entity.setMovieSections(sections);
                        return entity;
                    }
                }).subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<FirstPageEntity>() {
                    @Override
                    public void accept(FirstPageEntity o) throws Exception {
                        handleRes(o);
                    }
                });
    }

    private void handleRes(final FirstPageEntity entity) {
        finishDialog();
        SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_first_content, R.layout.item_first_header, entity.getMovieSections());
        sectionAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                MovieSection mySection = entity.getMovieSections().get(position);
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
//        View bannerView = LayoutInflater.from(getActivity()).inflate(header, null);
//        bannerView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, App.H / 4));
//        Banner banner = (Banner) bannerView.findViewById(R.id.banner);
        mHomeBanner.setImages(entity.getBanners())
                .setImageLoader(new BannerLoader())
                .start();
//        sectionAdapter.addHeaderView(bannerView);
        mRecyclerView.setAdapter(sectionAdapter);
    }
}

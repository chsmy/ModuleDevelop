package com.chs.moduledevelop.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chs.library.base.BaseFragment;
import com.chs.moduledevelop.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class SecondFragment extends BaseFragment {
    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    Unbinder unbinder;
    private String[] mTitles = new String[]{"Android","Java","Web","ios","python"};
    private List<MovieFragment> mFragmentList;
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    private ContentAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, null);
        unbinder = ButterKnife.bind(this, view);
        initFragment();
        initView();
        return view;
    }

    private void initFragment() {
        mFragmentList = new ArrayList<>();
        mFragmentList.clear();
        for (String mTitle : mTitles) {
            Bundle bundle = new Bundle();
            bundle.putString("searchName", mTitle);
            mFragmentList.add(MovieFragment.newInstance(bundle));
        }
    }

    private void initView() {
        mAdapter = new ContentAdapter(getChildFragmentManager());
        mViewpager.setAdapter(mAdapter);
        mTab.setupWithViewPager(mViewpager);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
    private class ContentAdapter extends FragmentStatePagerAdapter{

        public ContentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }
    }
}

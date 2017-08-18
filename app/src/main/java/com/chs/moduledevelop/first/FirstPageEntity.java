package com.chs.moduledevelop.first;

import java.util.List;

/**
 * 作者：chs on 2017-08-18 14:38
 * 邮箱：657083984@qq.com
 */

public class FirstPageEntity {
    private List<String> banners;
    private List<MovieSection> mMovieSections;

    public List<String> getBanners() {
        return banners;
    }

    public void setBanners(List<String> banners) {
        this.banners = banners;
    }

    public List<MovieSection> getMovieSections() {
        return mMovieSections;
    }

    public void setMovieSections(List<MovieSection> movieSections) {
        mMovieSections = movieSections;
    }
}

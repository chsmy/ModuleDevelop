package com.chs.moduledevelop.net;

import com.chs.moduledevelop.first.HeatMovieEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：chs on 2017-08-10 14:15
 * 邮箱：657083984@qq.com
 */

public interface GetServiceData {
    //获取热门电影
    @GET("movie/in_theaters")
    Observable<HeatMovieEntity> getHeatMovie(@Query("start") int start, @Query("count") int count);
    //获取即将上映的电影
    @GET("movie/coming_soon")
    Observable<HeatMovieEntity> getComingMovie(@Query("start") int start, @Query("count") int count);
}

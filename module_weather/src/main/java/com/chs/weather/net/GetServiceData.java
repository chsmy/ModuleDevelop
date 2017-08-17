package com.chs.weather.net;

import com.chs.weather.module.WeatherEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：chs on 2017-08-04 15:34
 * 邮箱：657083984@qq.com
 */

public interface GetServiceData {
    @GET("listWeather/")
    Observable<WeatherEntity> getWeather(@Query("cityIds") int cityId);
}

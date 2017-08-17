package com.chs.weather.net;

import com.chs.library.http.RetrofitManager;
import com.chs.weather.module.WeatherEntity;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-08-10 14:18
 * 邮箱：657083984@qq.com
 */

public class WeatherDataManager {

    private String baseUrl = "http://aider.meizu.com/app/weather/";
    private WeatherDataManager() {
        RetrofitManager.getInstance().initRetrofit(baseUrl);
    }
    //在访问HttpMethods时创建单例
    private static class SingletonHolder{
        private static final WeatherDataManager INSTANCE = new WeatherDataManager();
    }
    //获取单例
    public static WeatherDataManager getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void getWeather(Observer<WeatherEntity> observer, int cityId){

        Observable<WeatherEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getWeather(cityId);

        toSubscribe(observable, observer);
    }
    private <T> void toSubscribe(Observable<T> o, Observer<T> observer){
        o.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .subscribe(observer);
    }
}

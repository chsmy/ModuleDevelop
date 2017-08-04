package com.chs.weather;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chs.library.base.BaseActivity;
import com.chs.library.http.RetrofitManager;
import com.chs.library.util.LogUtils;
import com.chs.weather.module.WeatherEntity;
import com.chs.weather.net.GetServiceData;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@Route(path = "/weather/WeatherActivity")
public class WeatherActivity extends BaseActivity {
    private String baseUrl = "http://aider.meizu.com/app/weather/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity_weather);
        RetrofitManager.getInstance().initRetrofit(baseUrl);
        Observable<WeatherEntity> weather = RetrofitManager.getInstance().createReq(GetServiceData.class).getWeather(101010100);
        toSubscribe(weather, new Observer<WeatherEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
                LogUtils.i("weatherEntity","onSubscribe");
            }

            @Override
            public void onNext(WeatherEntity weatherEntity) {
                LogUtils.i("weatherEntity",weatherEntity.getValue().get(0).getCity());
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.i("weatherEntity","onError:"+e.getMessage());
            }

            @Override
            public void onComplete() {
                LogUtils.i("weatherEntity","onComplete");
            }
        });
    }
}

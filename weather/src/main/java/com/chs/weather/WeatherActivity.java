package com.chs.weather;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chs.library.base.BaseActivity;
import com.chs.library.http.RetrofitManager;
import com.chs.library.util.LogUtils;
import com.chs.library.util.statusbar.ImmersionBar;
import com.chs.weather.module.WeatherEntity;
import com.chs.weather.net.GetServiceData;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@Route(path = "/weather/WeatherActivity")
public class WeatherActivity extends BaseActivity {
    @BindView(R2.id.weather_tv_city)
    TextView mWeatherTvCity;
    @BindView(R2.id.weather_tv_temperature)
    TextView mWeatherTvTemperature;
    @BindView(R2.id.weather_tv_temperature_del)
    TextView mWeatherTvTemperatureDel;
    private String baseUrl = "http://aider.meizu.com/app/weather/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity_weather);
        ButterKnife.bind(this);
        ImmersionBar.with(this)
                .transparentBar()
                .init();
        RetrofitManager.getInstance().initRetrofit(baseUrl);
        createLoadingDialog(this, getString(R.string.loading));
        Observable<WeatherEntity> weather = RetrofitManager.getInstance().createReq(GetServiceData.class).getWeather(101010100);
        toSubscribe(weather, new Observer<WeatherEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
                LogUtils.i("weatherEntity", "onSubscribe");
            }

            @Override
            public void onNext(WeatherEntity weatherEntity) {
                WeatherEntity.ValueEntity valueEntity = weatherEntity.getValue().get(0);
                mWeatherTvCity.setText(valueEntity.getCity());
                mWeatherTvTemperature.setText(valueEntity.getRealtime().getTemp());
                mWeatherTvTemperatureDel.setText(valueEntity.getRealtime().getWeather());
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.i("weatherEntity", "onError:" + e.getMessage());
            }

            @Override
            public void onComplete() {
                finishDialog();
                LogUtils.i("weatherEntity", "onComplete");
            }
        });
    }
}

package com.chs.weather;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chs.library.base.BaseActivity;
import com.chs.library.util.LogUtils;
import com.chs.library.util.StatusBarUtil;
import com.chs.weather.module.WeatherEntity;
import com.chs.weather.net.WeatherDataManager;

import butterknife.BindView;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        createLoadingDialog(getString(R.string.loading));
        WeatherDataManager.getInstance().getWeather(new Observer<WeatherEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

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
        }, 101010100);
    }

    @Override
    public int getLayoutId() {
        return R.layout.weather_activity_weather;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }
}

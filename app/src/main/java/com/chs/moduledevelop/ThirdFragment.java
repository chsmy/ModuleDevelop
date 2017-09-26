package com.chs.moduledevelop;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chs.library.base.BaseFragment;

import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class ThirdFragment extends BaseFragment {
    Unbinder unbinder;

    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_third;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.weather,R.id.zhihu})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.weather:
                ARouter.getInstance().build("/weather/WeatherActivity").navigation();
                break;
            case R.id.zhihu:
                ARouter.getInstance().build("/zhihu/ZhiHuActivity").navigation();
                break;
        }
    }
}

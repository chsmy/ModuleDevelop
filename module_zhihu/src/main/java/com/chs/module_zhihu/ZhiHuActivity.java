package com.chs.module_zhihu;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chs.library.base.BaseActivity;

/**
 * 作者：chs on 2017-09-26 16:13
 * 邮箱：657083984@qq.com
 */
@Route(path = "/zhihu/ZhiHuActivity")
public class ZhiHuActivity extends BaseActivity {
    @Override
    public int getLayoutId() {
        return R.layout.zhihu_home;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }
}

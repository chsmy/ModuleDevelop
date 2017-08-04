package com.chs.moduledevelop;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chs.library.base.BaseApplication;

/**
 * 作者：chs on 2017-08-03 16:35
 * 邮箱：657083984@qq.com
 */

public class App extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}

package com.chs.moduledevelop;

import android.os.Bundle;

import com.chs.library.base.BaseFragment;

/**
 * 作者：chs on 2017-08-03 15:42
 * 邮箱：657083984@qq.com
 */

public class FourFragment extends BaseFragment {
    public static FourFragment newInstance() {
        return new FourFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_four;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}

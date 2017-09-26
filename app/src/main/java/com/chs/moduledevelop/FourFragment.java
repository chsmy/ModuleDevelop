package com.chs.moduledevelop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        return 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("four");
        textView.setTextSize(50);
        textView.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
        return textView;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}

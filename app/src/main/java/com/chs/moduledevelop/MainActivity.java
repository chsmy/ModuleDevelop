package com.chs.moduledevelop;

import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.chs.library.base.BaseActivity;
import com.chs.library.util.StatusBarUtil;
import com.chs.moduledevelop.first.FirstFragment;
import com.chs.moduledevelop.second.SecondFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    private Fragment mTab01;
    private Fragment mTab02;
    private Fragment mTab03;
    private Fragment mTab04;
    private List<RadioButton> mTabs;
    private long touchTime = 0;
    private static final long DOUBLE_CLICK_INTERVAL = 2 * 1000;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        StatusBarUtil.setTransparentForImageViewInFragment(this,null);
        mTabs = new ArrayList<>();
        mTabs.add((RadioButton) findViewById(R.id.tab_first));
        mTabs.add((RadioButton) findViewById(R.id.tab_second));
        mTabs.add((RadioButton) findViewById(R.id.tab_third));
        mTabs.add((RadioButton) findViewById(R.id.tab_four));
        setSelect(0);
    }

    @OnClick({R.id.tab_first, R.id.tab_second, R.id.tab_third, R.id.tab_four})
    public void onViewClicked(View view) {
        resetImgs();
        switch (view.getId()) {
            case R.id.tab_first:
                setSelect(0);
                break;
            case R.id.tab_second:
                setSelect(1);
                break;
            case R.id.tab_third:
                setSelect(2);
                break;
            case R.id.tab_four:
                setSelect(3);
                break;
        }
    }
    private void setSelect(int i) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        hideFragment(transaction);
        // 把图片设置为亮的
        // 设置内容区域
        switch (i) {
            case 0:
                if (mTab01 == null) {
                    mTab01 = FirstFragment.newInstance();
                    transaction.add(R.id.id_content, mTab01);
                } else {
                    transaction.show(mTab01);
                }
                mTabs.get(0).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_home_pressed_icon, 0, 0);
                break;
            case 1:
                if (mTab02 == null) {
                    mTab02 = SecondFragment.newInstance();
                    transaction.add(R.id.id_content, mTab02);
                } else {
                    transaction.show(mTab02);

                }
                mTabs.get(1).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_move_pressed_icon, 0, 0);
                break;
            case 2:
                if (mTab03 == null) {
                    mTab03 = ThirdFragment.newInstance();
                    transaction.add(R.id.id_content, mTab03);
                } else {
                    transaction.show(mTab03);
                }
                mTabs.get(2).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_found_pressed_icon, 0, 0);
                break;
            case 3:
                if (mTab04 == null) {
                    mTab04 = FourFragment.newInstance();
                    transaction.add(R.id.id_content, mTab04);
                } else {
                    transaction.show(mTab04);
                }
                mTabs.get(3).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_me_pressed_icon, 0, 0);
                break;

            default:
                break;
        }

        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (mTab01 != null) {
            transaction.hide(mTab01);
        }
        if (mTab02 != null) {
            transaction.hide(mTab02);
        }
        if (mTab03 != null) {
            transaction.hide(mTab03);
        }
        if (mTab04 != null) {
            transaction.hide(mTab04);
        }
    }

    /**
     * 切换图片至暗色
     */
    private void resetImgs() {
        mTabs.get(0).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_home_icon, 0, 0);
        mTabs.get(1).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_move_icon, 0, 0);
        mTabs.get(2).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_found_icon, 0, 0);
        mTabs.get(3).setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.tab_me_icon, 0, 0);
    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        if ((currentTime - touchTime) >= DOUBLE_CLICK_INTERVAL) {
            Toast.makeText(getApplicationContext(), R.string.double_click_back, Toast.LENGTH_SHORT).show();
            touchTime = currentTime;
        } else {
            super.onBackPressed();
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

}

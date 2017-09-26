package com.chs.library.base;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chs.library.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：chs on 2017-08-03 15:46
 * 邮箱：657083984@qq.com
 */

public abstract class BaseFragment extends Fragment {
    /**
     * Fragment当前状态是否可见
     */
    private Dialog mLoadingDialog;
    private Unbinder bind;

    public abstract
    @LayoutRes
    int getLayoutResId();

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            onVisible();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        return inflater.inflate(getLayoutResId(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = ButterKnife.bind(this, view);
        finishCreateView(savedInstanceState);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (bind != null) {
            bind.unbind();
        }
    }

    /**
     * 初始化views
     *
     * @param state
     */
    public abstract void finishCreateView(Bundle state);

    /**
     * 加载数据
     */
    protected void loadData(boolean isShowLoading) {
        if (isShowLoading) {
            createLoadingDialog(getString(R.string.loading));
        }
    }

    /**
     * 可见
     */
    protected void onVisible() {

    }

    /**
     * 得到自定义的progressDialog
     *
     * @param msg
     */
    public void createLoadingDialog(String msg) {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View v = inflater.inflate(R.layout.loading_dialog, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 加载动画
        tipTextView.setText(msg);// 设置加载信息
        if (mLoadingDialog == null) {
            mLoadingDialog = new Dialog(getActivity(), R.style.MyDialog);// 创建自定义样式dialog
//      loadingDialog.setCancelable(true);// 不可以用“返回键”取消
            mLoadingDialog.setCanceledOnTouchOutside(false);
            mLoadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局
            mLoadingDialog.show();
        }

    }

    /**
     * 关闭自定义的progressDialog
     */
    public void finishDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
            mLoadingDialog = null;
        }
    }
}

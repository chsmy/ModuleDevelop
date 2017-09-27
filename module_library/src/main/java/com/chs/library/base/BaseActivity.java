package com.chs.library.base;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chs.library.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：chs on 2017-08-03 14:02
 * 邮箱：657083984@qq.com
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Dialog mLoadingDialog;
    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局内容
        setContentView(getLayoutId());
        BaseApplication.getInstance().addActivity(this);
        bind = ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getInstance().finishActivity(this);
        bind.unbind();
    }

    /**
     * 得到自定义的progressDialog
     *
     * @param msg
     */
    public void createLoadingDialog(String msg) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View v = inflater.inflate(R.layout.loading_dialog, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 加载动画
        tipTextView.setText(msg);// 设置加载信息
        if (mLoadingDialog == null) {
            mLoadingDialog = new Dialog(this, R.style.MyDialog);// 创建自定义样式dialog
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

    /**
     * 设置布局layout
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 初始化views
     *
     * @param savedInstanceState
     */
    public abstract void initViews(Bundle savedInstanceState);

    /**
     * 加载数据
     */
    protected void loadData(boolean isShowLoading) {
        if (isShowLoading) {
            createLoadingDialog(getString(R.string.loading));
        }
    }
}

package com.chs.library.base;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chs.library.R;

/**
 * 作者：chs on 2017-08-03 15:46
 * 邮箱：657083984@qq.com
 */

public abstract class BaseFragment extends Fragment {
    /** Fragment当前状态是否可见 */
    protected boolean isVisible;
    private Dialog mLoadingDialog;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInvisible();
        }
    }
    /**
     * 可见
     */
    protected void onVisible() {
        lazyLoad();
    }

    /**
     * 不可见
     */
    protected void onInvisible() {


    }

    /**
     * 延迟加载
     */
    protected  void lazyLoad(){

    };
    /**
     * 得到自定义的progressDialog
     *
     * @param msg
     */
    public  void createLoadingDialog(Context context, String msg) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.loading_dialog, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 加载动画
        tipTextView.setText(msg);// 设置加载信息
        if(mLoadingDialog==null){
            mLoadingDialog = new Dialog(context, R.style.MyDialog);// 创建自定义样式dialog
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
    public  void finishDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
            mLoadingDialog=null;
        }
    }
}

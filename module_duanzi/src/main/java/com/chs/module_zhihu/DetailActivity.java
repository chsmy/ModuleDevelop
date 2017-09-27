package com.chs.module_zhihu;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.chs.library.base.BaseActivity;

import butterknife.BindView;

/**
 * 作者：chs on 2017-09-27 10:48
 * 邮箱：657083984@qq.com
 */

public class DetailActivity extends BaseActivity {
    @BindView(R2.id.zhihu_tv_detail)
    TextView mTvContent;

    @Override
    public int getLayoutId() {
        return R.layout.zhihu_content;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        String content = getIntent().getStringExtra("content");
        if (content != null && !content.equals("")) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                mTvContent.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
            } else {
                mTvContent.setText(Html.fromHtml(content));
            }
        }
    }
}

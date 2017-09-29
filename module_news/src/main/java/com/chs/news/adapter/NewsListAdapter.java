package com.chs.news.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chs.library.base.adapter.BaseQuickAdapter;
import com.chs.library.base.adapter.BaseViewHolder;
import com.chs.library.image.ImageLoader;
import com.chs.news.R;
import com.chs.news.module.NewsListEntity;

import java.util.List;

/**
 * 作者：chs on 2017-09-27 10:06
 * 邮箱：657083984@qq.com
 */

public class NewsListAdapter extends BaseQuickAdapter<NewsListEntity.News, BaseViewHolder> {

    public NewsListAdapter(@LayoutRes int layoutResId, @Nullable List<NewsListEntity.News> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsListEntity.News item) {
                helper.setText(R.id.tv_title, item.getTitle());
                ImageLoader.loadImageView(mContext, item.getImgsrc(), (ImageView) helper.getView(R.id.iv_title));
    }

}

package com.chs.moduledevelop.second;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chs.library.base.adapter.BaseQuickAdapter;
import com.chs.library.base.adapter.BaseViewHolder;
import com.chs.library.image.ImageLoader;
import com.chs.moduledevelop.R;

import java.util.List;

/**
 * 作者：chs on 2017-08-11 15:16
 * 邮箱：657083984@qq.com
 */

public class BookAdapter extends BaseQuickAdapter<BookEntity.BooksEntity,BaseViewHolder>{

    public BookAdapter(@LayoutRes int layoutResId, @Nullable List<BookEntity.BooksEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BookEntity.BooksEntity item) {
        ImageLoader.loadImageView(mContext,item.getImages().getLarge(), (ImageView) helper.getView(R.id.iv_book_img));
        helper.setText(R.id.tv_author,item.getAuthor().size()>0?item.getAuthor().get(0):"暂无");
        helper.setText(R.id.tv_press,item.getPublisher());
        helper.setText(R.id.tv_date,item.getPubdate());
    }
}

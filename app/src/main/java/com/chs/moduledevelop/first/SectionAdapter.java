package com.chs.moduledevelop.first;

import android.widget.ImageView;

import com.chs.library.base.adapter.BaseSectionQuickAdapter;
import com.chs.library.base.adapter.BaseViewHolder;
import com.chs.library.image.ImageLoader;
import com.chs.moduledevelop.R;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class SectionAdapter extends BaseSectionQuickAdapter<MovieSection, BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param sectionHeadResId The section head layout id for each item
     * @param layoutResId      The layout resource id of each item.
     * @param data             A new list is created out of this one to avoid mutable list
     */
    public SectionAdapter(int layoutResId, int sectionHeadResId, List data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, final MovieSection item) {
        helper.setText(R.id.tv_title, item.header);
        helper.setVisible(R.id.tv_more, true);
        helper.addOnClickListener(R.id.tv_more);
    }


    @Override
    protected void convert(BaseViewHolder helper, MovieSection item) {
        int pos = helper.getLayoutPosition();
        HeatMovieEntity.SubjectsEntity entity = (HeatMovieEntity.SubjectsEntity) item.t;
        String path = entity.getImages().getLarge();
        ImageLoader.loadImageView(mContext,path, (ImageView) helper.getView(R.id.iv_img));
        helper.setText(R.id.tv_des, entity.getTitle());
    }
}

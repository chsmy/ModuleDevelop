package com.chs.module_duanzi.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chs.library.base.adapter.BaseQuickAdapter;
import com.chs.library.base.adapter.BaseViewHolder;
import com.chs.library.image.ImageLoader;
import com.chs.module_duanzi.R;
import com.chs.module_duanzi.module.DuanZiListEntity;

import java.util.List;

/**
 * 作者：chs on 2017-09-27 10:06
 * 邮箱：657083984@qq.com
 */

public class DuanZiListAdapter extends BaseQuickAdapter<DuanZiListEntity.DataEntityX.DataEntity, BaseViewHolder> {

    public DuanZiListAdapter(@LayoutRes int layoutResId, @Nullable List<DuanZiListEntity.DataEntityX.DataEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DuanZiListEntity.DataEntityX.DataEntity item) {
        if(item.getGroup()!=null){
            DuanZiListEntity.DataEntityX.DataEntity.GroupEntity.UserEntity user = item.getGroup().getUser();
            if(user!=null){
                helper.setText(R.id.tv_title, user.getName());
            }
            DuanZiListEntity.DataEntityX.DataEntity.GroupEntity.MiddleImageEntity large_image = item.getGroup().getLarge_image();
            if(large_image!=null){
                ImageLoader.loadImageView(mContext, large_image.getUrl_list().get(0).getUrl(), (ImageView) helper.getView(R.id.iv_title));
            }
        }
    }

}

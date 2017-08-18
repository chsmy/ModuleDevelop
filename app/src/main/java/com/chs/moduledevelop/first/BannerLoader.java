package com.chs.moduledevelop.first;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;

/**
 * 作者：chs on 2017-08-18 11:26
 * 邮箱：657083984@qq.com
 */

public class BannerLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        com.chs.library.image.ImageLoader.loadImageView(context, (String) path,imageView);
    }
}

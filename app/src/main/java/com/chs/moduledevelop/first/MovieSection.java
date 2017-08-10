package com.chs.moduledevelop.first;

import com.chs.library.base.adapter.entity.SectionEntity;

/**
 * 作者：chs on 2017-08-10 15:29
 * 邮箱：657083984@qq.com
 */

public class MovieSection extends SectionEntity<HeatMovieEntity.SubjectsEntity> {

    public MovieSection(HeatMovieEntity.SubjectsEntity subjectsEntity) {
        super(subjectsEntity);
    }

    public MovieSection(boolean isHeader, String header) {
        super(isHeader, header);
    }
}

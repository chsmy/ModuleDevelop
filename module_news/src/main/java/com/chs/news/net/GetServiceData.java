package com.chs.news.net;


import com.chs.news.module.NewsListEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 作者：chs on 2017-09-27 09:54
 * 邮箱：657083984@qq.com
 */

public interface GetServiceData {
    /**
     * @return
     */
    @GET("nc/article/headline/T1348647909107/0-20.html")
    Observable<NewsListEntity> getZhiHuList();
}

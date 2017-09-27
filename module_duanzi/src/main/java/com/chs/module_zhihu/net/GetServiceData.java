package com.chs.module_zhihu.net;

import com.chs.module_zhihu.module.DuanZiListEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：chs on 2017-09-27 09:54
 * 邮箱：657083984@qq.com
 */

public interface GetServiceData {
    /**
     * http://is.snssdk.com/neihan/stream/mix/v1/?mpic=1&webp=1&essence=1&content_type=-103
     * &message_cursor=-1&am_longitude=110&am_latitude=120&am_city=%E5%8C%97%E4%BA%AC%E5%B8%82&
     * am_loc_time=1489226058493&count=30&min_time=1489226061&screen_width=1450&
     * do00le_col_mode=0&iid=3216590132&device_id=32613520945&ac=wifi&channel=360&aid=7&app_name=joke_essay&version_code=612&
     * version_name=6.1.2&device_platform=android&ssmix=a&device_type=sansung&device_brand=xiaomi&
     * os_api=28&os_version=6.10.1&uuid=326135942187625&openudid=3dg6s95rhg2a3dg5&manifest_version_code=612&resolution=1450*2800&dpi=620&
     * update_version_code=6120
     * @return
     */
    @GET("stream/mix/v1/")
    Observable<DuanZiListEntity> getZhiHuList(@Query("mpic") int mpic , @Query("webp") int webp, @Query("essence") int essence,
                                              @Query("content_type") int content_type, @Query("message_cursor") int message_cursor,
                                              @Query("am_longitude") int am_longitude, @Query("am_latitude") int am_latitude,
                                              @Query("am_city") String am_city, @Query("am_loc_time") long am_loc_time, @Query("count") int count,
                                              @Query("min_time") long min_time, @Query("screen_width") int screen_width,
                                              @Query("do00le_col_mode") int do00le_col_mode, @Query("iid") long iid, @Query("device_id") long device_id,
                                              @Query("ac") String ac, @Query("channel") String channel, @Query("aid") int aid,
                                              @Query("app_name") String app_name, @Query("version_code") int version_code,
                                              @Query("version_name") String version_name, @Query("ssmix") String ssmix, @Query("device_platform") String device_platform,
                                              @Query("device_type") String device_type, @Query("device_brand") String device_brand,
                                              @Query("os_api") int os_api , @Query("os_version") String os_version ,
                                              @Query("uuid") String uuid, @Query("openudid") String openudid,
                                              @Query("manifest_version_code") int manifest_version_code , @Query("resolution") String resolution ,
                                              @Query("dpi") int dpi , @Query("update_version_code") int update_version_code );
}

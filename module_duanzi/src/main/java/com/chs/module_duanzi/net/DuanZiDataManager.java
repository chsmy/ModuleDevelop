package com.chs.module_duanzi.net;

import com.chs.library.http.RetrofitManager;
import com.chs.module_duanzi.module.DuanZiListEntity;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-09-27 09:54
 * 邮箱：657083984@qq.com
 */

public class DuanZiDataManager {
    private String baseUrl = "http://is.snssdk.com/neihan/";
    private DuanZiDataManager() {
        RetrofitManager.getInstance().initRetrofit(baseUrl);
    }
    //在访问HttpMethods时创建单例
    private static class SingletonHolder{
        private static final DuanZiDataManager INSTANCE = new DuanZiDataManager();
    }
    //获取单例
    public static DuanZiDataManager getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void getZhuHuList(Observer<DuanZiListEntity> observer){
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
        Observable<DuanZiListEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getZhiHuList(
          1,1,1,-103,-1,110,120,"%E5%8C%97%E4%BA%AC%E5%B8%82",1489226058493L,30,1489226061L,1450,0,3216590132L,32613520945L,"wifi",
                "360",1,"joke_essay",612,"6.1.2","android","a","sansung","xiaomi",28,"6.10","326135942187625","3dg6s95rhg2a3dg5"
                ,612,"1450*2800",620,6120);

        toSubscribe(observable, observer);
    }
    private <T> void toSubscribe(Observable<T> o, Observer<T> observer){
        o.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .subscribe(observer);
    }
}

package com.chs.news.net;

import com.chs.library.http.RetrofitManager;
import com.chs.news.module.NewsListEntity;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-09-27 09:54
 * 邮箱：657083984@qq.com
 */

public class NewsDataManager {
    public NewsDataManager() {
        String baseUrl = "https://c.m.163.com/";
        RetrofitManager.getInstance().initRetrofit(baseUrl);
    }
    public void getZhuHuList(Observer<NewsListEntity> observer){
        /**
         * @return
         */
        Observable<NewsListEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getZhiHuList();

        toSubscribe(observable, observer);
    }
    private <T> void toSubscribe(Observable<T> o, Observer<T> observer){
        o.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .subscribe(observer);
    }
}

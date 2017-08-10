package com.chs.moduledevelop.net;

import com.chs.library.http.RetrofitManager;
import com.chs.moduledevelop.first.HeatMovieEntity;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-08-10 14:18
 * 邮箱：657083984@qq.com
 */

public class DataManager {

    private String baseUrl = "https://api.douban.com/v2/";
    private DataManager() {
        RetrofitManager.getInstance().initRetrofit(baseUrl);
    }
    //在访问HttpMethods时创建单例
    private static class SingletonHolder{
        private static final DataManager INSTANCE = new DataManager();
    }
    //获取单例
    public static DataManager getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private <T> void toSubscribe(Observable<T> o, Observer<T> observer){
                o.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .subscribe(observer);
    }

    /**
     * 获取热门电影
     * @param observer
     * @param start
     * @param count
     */
    public void getHeatMovie(Observer<HeatMovieEntity> observer, int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getHeatMovie(start,count);

        toSubscribe(observable, observer);
    }
    public Observable<HeatMovieEntity> getHeatMovieObservable(int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getHeatMovie(start,count);
                observable.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());//指定observer
        return observable;
    }
    /**
     * 获取即将上映的电影
     * @param observer
     * @param start
     * @param count
     */
    public void getComingMovie(Observer<HeatMovieEntity> observer, int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getComingMovie(start,count);

        toSubscribe(observable, observer);
    }
    public Observable<HeatMovieEntity> getComingMovieObservable(int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().createReq(GetServiceData.class).getComingMovie(start,count);
                observable.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());//指定observer
        return observable;
    }


}

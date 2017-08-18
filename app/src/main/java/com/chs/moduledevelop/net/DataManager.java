package com.chs.moduledevelop.net;

import com.chs.library.http.RetrofitManager;
import com.chs.moduledevelop.first.BannerEntity;
import com.chs.moduledevelop.first.HeatMovieEntity;
import com.chs.moduledevelop.second.BookEntity;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：chs on 2017-08-10 14:18
 * 邮箱：657083984@qq.com
 */

public class DataManager {

    private String baseUrl_1 = "https://api.douban.com/v2/";
    private String baseUrl_2 = "http://qt.qq.com";
    private DataManager() {
//        RetrofitManager.getInstance().initRetrofit(baseUrl);
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

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().initRetrofit(baseUrl_1).createReq(GetServiceData.class).getHeatMovie(start,count);

        toSubscribe(observable, observer);
    }
    /**
     * 获取热门电影    返回Observable 用于api合并
     * @param start
     * @param count
     */
    public Observable<HeatMovieEntity> getHeatMovieObservable(int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().initRetrofit(baseUrl_1).createReq(GetServiceData.class).getHeatMovie(start,count);
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

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().initRetrofit(baseUrl_1).createReq(GetServiceData.class).getComingMovie(start,count);

        toSubscribe(observable, observer);
    }
    /**
     * 获取即将上映的电影   返回Observable 用于api合并
     * @param start
     * @param count
     */
    public Observable<HeatMovieEntity> getComingMovieObservable(int start, int count){

        Observable<HeatMovieEntity> observable = RetrofitManager.getInstance().initRetrofit(baseUrl_1).createReq(GetServiceData.class).getComingMovie(start,count);
                observable.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());//指定observer
        return observable;
    }

    /**
     * 获取图书列表
     * @param observer
     * @param searchName
     * @param start
     * @param count
     */
    public void getBookList(Observer<BookEntity> observer,String searchName,int start,int count){
        Observable<BookEntity> observable = RetrofitManager.getInstance().initRetrofit(baseUrl_1).createReq(GetServiceData.class).getBookList(searchName,
                "id,title,images,author,pubdate,publisher,url,alt",start,count);
        toSubscribe(observable, observer);
    }

    /**
     * 获取轮播图
     */
    public void getBannerList(Consumer<List<String>> observer){
        Observable<BannerEntity> observable =  RetrofitManager.getInstance().initRetrofit(baseUrl_2).createReq(GetServiceData.class).getBanner("android",9724);
        observable.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .map(new Function<BannerEntity, List<String>>() {
                    @Override
                    public List<String> apply(BannerEntity bannerEntity) throws Exception {
                        List<String> banner = new ArrayList<String>();
                        for (BannerEntity.ListEntity e: bannerEntity.getList()) {
                            banner.add(e.getImage_url_big());
                        }
                        return banner;
                    }
                }).subscribe(observer);
    }
    /**
     * 获取轮播图 Observable
     */
    public Observable<BannerEntity> getBannerListObservable(){
        Observable<BannerEntity> observable =  RetrofitManager.getInstance().initRetrofit(baseUrl_2).createReq(GetServiceData.class).getBanner("android",9724);
        observable.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());//指定observer
        return observable;
    }
}

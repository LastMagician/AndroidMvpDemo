package com.leng.androidmvpdemo.presenter;

/**
 * Created by Administrator on 2016/4/20.
 */
public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}

package com.leng.androidmvpdemo.presenter;

/**
 * Created by Administrator on 2016/4/20.
 */
public interface IMainPresenter {

    void loadData();

    void loadDataSuccess(String str);

    void loadDataFailure();

}

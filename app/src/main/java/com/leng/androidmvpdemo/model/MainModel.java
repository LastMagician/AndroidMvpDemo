package com.leng.androidmvpdemo.model;

import android.os.Handler;

import com.leng.androidmvpdemo.presenter.IMainPresenter;
/**
 * Created by Administrator on 2016/4/20.
 */
public class MainModel {

    private IMainPresenter iMainPresenter;

    public MainModel(IMainPresenter iMainPresenter) {
        this.iMainPresenter = iMainPresenter;
    }

    public void loadData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String content = "This is a content.";
                iMainPresenter.loadDataSuccess(content);
            }
        }, 2000);

    }

}

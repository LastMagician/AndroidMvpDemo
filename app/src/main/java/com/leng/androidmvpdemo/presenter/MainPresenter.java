package com.leng.androidmvpdemo.presenter;

import com.leng.androidmvpdemo.model.MainModel;
import com.leng.androidmvpdemo.view.MainView;

/**
 * Created by Administrator on 2016/4/20.
 */
public class MainPresenter implements Presenter<MainView>, IMainPresenter {

    MainView mainView;
    MainModel mainModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mainModel = new MainModel(this);
    }

    public void attachView(MainView view) {
        this.mainView = view;
    }

    public void detachView() {
        this.mainView = null;
    }

    public void loadData() {
        if (mainView != null) {
            mainView.showProgress();
        }
        mainModel.loadData();

    }

    public void loadDataSuccess(String content) {
        if (mainView != null) {
            mainView.showData(content);
            mainView.hideProgress();
        }

    }

    public void loadDataFailure() {
        if (mainView != null) {
            mainView.hideProgress();
        }

    }

}

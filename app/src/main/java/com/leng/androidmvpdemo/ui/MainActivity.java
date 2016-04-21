package com.leng.androidmvpdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.leng.androidmvpdemo.R;
import com.leng.androidmvpdemo.presenter.MainPresenter;
import com.leng.androidmvpdemo.view.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    @Bind(R.id.button) Button button;
    @Bind(R.id.text) TextView text;
    @Bind(R.id.progressBar) ProgressBar progressBar;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ButterKnife.bind(this);
        button.setOnClickListener(this);
        presenter = new MainPresenter(this);
    }

    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    public void showData(String content) {
        text.setText(content);
    }

    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    public void onClick(View v) {
        presenter.loadData();
    }
}

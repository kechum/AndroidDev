package com.tutorials.hackro.androiddev.presentation.view.activity;

import android.widget.Toast;

import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.presentation.BaseActivity;
import com.tutorials.hackro.androiddev.presentation.HomeApplication;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainPresenter.View{

    @Inject
    MainPresenter presenter;

    @Override
    public void initView() {
        super.initView();
        initializeDagger();
        initializePresenter();
        presenter.initialize();
    }

    private void initializeDagger() {
        HomeApplication app = (HomeApplication) getApplication();
        app.getAppComponent().inject(this);
    }



    private void initializePresenter() {
        presenter.setView(this);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    public void methodAMainActivity() {
        Toast.makeText(this,"Hola Ali",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void methodBMainActivity() {
    }
    @Override
    public void showLoading() {
    }
    @Override
    public void hideLoading() {
    }
    @Override
    public void showError(String message) {
    }
}

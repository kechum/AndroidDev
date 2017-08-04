package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends  Presenter<MainPresenter.View>{

    SharedPreferences sharedPreferences;
    @Inject
    public MainPresenter(SharedPreferences sharedPreferences){
        this.sharedPreferences = sharedPreferences;
    }


    @Override
    public void initialize() {
        super.initialize();
        getView().methodAMainActivity();

    }

    public interface View extends Presenter.View{
        void methodAMainActivity();
        void methodBMainActivity();
    }


}

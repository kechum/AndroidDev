package com.tutorials.hackro.androiddev.presentation;

import android.app.Application;

import com.tutorials.hackro.androiddev.di.component.AppComponent;
import com.tutorials.hackro.androiddev.di.component.DaggerAppComponent;
import com.tutorials.hackro.androiddev.di.module.AndroidDevModule;
import com.tutorials.hackro.androiddev.di.module.AppModule;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */
public class HomeApplication extends Application{

    @Inject AppComponent appComponent;


    @Override public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .androidDevModule(new AndroidDevModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
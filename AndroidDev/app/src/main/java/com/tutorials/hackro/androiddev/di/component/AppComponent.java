package com.tutorials.hackro.androiddev.di.component;

import com.tutorials.hackro.androiddev.di.module.AndroidDevModule;
import com.tutorials.hackro.androiddev.di.module.AppModule;
import com.tutorials.hackro.androiddev.presentation.view.activity.DetailPostActivity;
import com.tutorials.hackro.androiddev.presentation.view.activity.MainActivity;
import com.tutorials.hackro.androiddev.presentation.view.presenter.DetailPostPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hackro on 3/08/17.
 */

@Singleton
@Component(modules = {AppModule.class, AndroidDevModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(DetailPostActivity detailPostActivity);
}

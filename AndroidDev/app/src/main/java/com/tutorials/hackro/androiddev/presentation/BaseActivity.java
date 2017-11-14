package com.tutorials.hackro.androiddev.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;

import butterknife.ButterKnife;
import io.fabric.sdk.android.Fabric;

/**
 * Created by hackro on 3/08/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initializeView();
        //initFabric();

    }

    public void initializeView() {
        bindView();
    }

    protected abstract int getLayoutId();

    public void initFabric() {
        Fabric.with(this, new Crashlytics());
    }


    public void bindView() {
        ButterKnife.bind(this);
    }

}

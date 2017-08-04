package com.tutorials.hackro.androiddev.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by hackro on 3/08/17.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
    }


    public void initView() {
        bindView();
    }
    protected abstract int getLayoutId();
    public void bindView(){
        ButterKnife.bind(this);
    }

}

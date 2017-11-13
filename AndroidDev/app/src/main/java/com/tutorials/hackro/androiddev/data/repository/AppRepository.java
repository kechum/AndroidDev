package com.tutorials.hackro.androiddev.data.repository;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;
import com.tutorials.hackro.androiddev.data.remote.DataRemote;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
//this class is the repository (providers data)
public class AppRepository implements DataSourceRepository {

    private DataRemote dataRemote;

    @Inject
    public AppRepository(@NonNull DataRemote dataRemote) {
        this.dataRemote = dataRemote;
    }

    @Override
    public Observable<ResponseRedditData> getListResult() {
        return dataRemote.getListResult();
    }


}



package com.tutorials.hackro.androiddev.data.repository;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.remote.DataRemote;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponseUserFake;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
//this class is the repository (providers data)
public class AppRepository implements DataSourceRepository {

    private DataRemote dataRemote;

    @Inject public AppRepository(@NonNull DataRemote dataRemote) {
        this.dataRemote = dataRemote;
    }

    @Override public Observable<ResponseUserFakeDomain> getListResult() {
        return dataRemote.getListResult();
    }


}



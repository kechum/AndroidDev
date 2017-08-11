package com.tutorials.hackro.androiddev.data.repository;

import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.data.remote.DataRemote;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
//this class is the repository (providers data)
public class AppRepository implements DataSourceRepository {

    //data source// this interface is use in DataRemote

    //Local
    //Remote

    private DataRemote dataRemote;

    @Inject
    public AppRepository(DataRemote dataRemote) {
        this.dataRemote = dataRemote;
    }

    @Override
    public Observable<List<ResponsePost>> getListPost() {
        return dataRemote.getListPost();
    }

}



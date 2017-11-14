package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRemote {

    Observable<ResponseRedditData> getListResult();

    Observable<Object> getListComments(String id_post);


}

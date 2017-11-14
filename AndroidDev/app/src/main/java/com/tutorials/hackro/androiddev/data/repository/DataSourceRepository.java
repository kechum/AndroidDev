package com.tutorials.hackro.androiddev.data.repository;

import com.google.gson.internal.ObjectConstructor;
import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRepository {

    Observable<ResponseRedditData> getListResult();
    Observable<Object> getListComments(String id_post);

}

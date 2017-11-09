package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.domain.model.ResponseRedditDomain;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRemote {

    Observable<ResponseRedditDomain> getListResult();


}

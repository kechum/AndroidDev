package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;

import java.util.List;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRemote {

    Observable<ResponseUserFakeDomain> getListResult();


}

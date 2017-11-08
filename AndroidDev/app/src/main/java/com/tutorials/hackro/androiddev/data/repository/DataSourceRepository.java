package com.tutorials.hackro.androiddev.data.repository;

import com.tutorials.hackro.androiddev.domain.model.ResponsePhotoDomain;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserDomain;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;

import java.util.List;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRepository {

    Observable<ResponseUserFakeDomain> getListResult();

}

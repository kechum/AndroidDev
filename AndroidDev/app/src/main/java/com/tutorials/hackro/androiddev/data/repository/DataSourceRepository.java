package com.tutorials.hackro.androiddev.data.repository;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;

import java.util.List;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRepository {

    Observable<List<ResponsePost>> getListPost();
    Observable<List<ResponsePhoto>> getListPhotos();

}

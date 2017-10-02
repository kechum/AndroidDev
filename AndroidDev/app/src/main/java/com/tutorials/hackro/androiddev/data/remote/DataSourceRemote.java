package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.data.model.ResponseUser;

import java.util.List;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in AppRepository
public interface DataSourceRemote {

    Observable<List<ResponsePost>> getListPost();
    Observable<List<ResponsePhoto>> getListPhotos();
    Observable<List<ResponseUser>> getListUsers();

}

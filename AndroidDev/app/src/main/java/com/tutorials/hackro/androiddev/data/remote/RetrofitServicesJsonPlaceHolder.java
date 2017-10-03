package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.data.model.ResponseUser;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in DataRemote
public interface RetrofitServicesJsonPlaceHolder {

    /**
     *
     * @return
     */
    @GET(BuildConfig.ENDPOINT_POST)
    Observable<List<ResponsePost>> getListPost();

    @GET(BuildConfig.ENDPOINT_PHOTOS)
    Observable<List<ResponsePhoto>> getListPhotos();

    @GET(BuildConfig.ENDPOINT_USERS)
    Observable<List<ResponseUser>> getListUsers();


}

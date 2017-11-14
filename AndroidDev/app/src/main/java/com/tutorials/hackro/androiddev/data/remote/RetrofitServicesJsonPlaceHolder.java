package com.tutorials.hackro.androiddev.data.remote;

import android.os.Build;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in DataRemote
public interface RetrofitServicesJsonPlaceHolder {

    /**
     * @return
     */
    @GET(BuildConfig.BASE_API_TYPE)
    Observable<ResponseRedditData> getListResult(@Query(BuildConfig.API_PARAMETER) String result);

    @GET(BuildConfig.BASE_API_TYPE+ BuildConfig.API_ENDPOINT_COMMENTS)
    Observable<Object> getListComments(@Query(BuildConfig.API_PARAMETER_ID_POST) String id_post);

}

package com.tutorials.hackro.androiddev.data.remote;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this interface is use in DataRemote
public interface RetrofitServices {

    /**
     *
     * @return
     */
    @GET(BuildConfig.ENDPOINT_POST)
    Observable<List<ResponsePost>> getListPost();

}

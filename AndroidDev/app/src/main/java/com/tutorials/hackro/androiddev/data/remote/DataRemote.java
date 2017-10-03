package com.tutorials.hackro.androiddev.data.remote;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.data.model.ResponseUser;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this class is use in AppRepository
public class DataRemote implements DataSourceRemote {

    private Retrofit retrofit;

    @Inject
    public DataRemote(@NonNull Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @Override
    public Observable<List<ResponsePost>> getListPost() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListPost();
    }

    @Override
    public Observable<List<ResponsePhoto>> getListPhotos() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListPhotos();
    }

    @Override
    public Observable<List<ResponseUser>> getListUsers() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListUsers();
    }
}

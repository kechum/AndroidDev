package com.tutorials.hackro.androiddev.data.remote;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponseUserFake;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;

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
    private MapperResponseUserFake mapperResponseUserFake;

    @Inject public DataRemote(@NonNull Retrofit retrofit,@NonNull MapperResponseUserFake mapperResponseUserFake) {
        this.retrofit = retrofit;
        this.mapperResponseUserFake = mapperResponseUserFake;
    }


    @Override public Observable<ResponseUserFakeDomain> getListResult() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListResult(BuildConfig.NUMBER_RESULT).map(responseUserFakeDatas -> mapperResponseUserFake.map(responseUserFakeDatas));
    }
}

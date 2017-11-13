package com.tutorials.hackro.androiddev.data.remote;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;
import com.tutorials.hackro.androiddev.presentation.Utils.AssetsPropertyReader;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
// this class is use in AppRepository
public class DataRemote implements DataSourceRemote {

    private Retrofit retrofit;
    private AssetsPropertyReader assetsPropertyReader;

    @Inject
    public DataRemote(@NonNull Retrofit retrofit, @NonNull AssetsPropertyReader assetsPropertyReader) {
        this.retrofit = retrofit;
        this.assetsPropertyReader = assetsPropertyReader;
    }

    @Override
    public Observable<ResponseRedditData> getListResult() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListResult(assetsPropertyReader.getProperties(BuildConfig.PROPERTIES_FILE).getProperty(BuildConfig.NUMBER_RESULT));
    }
}

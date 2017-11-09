package com.tutorials.hackro.androiddev.data.remote;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponseReddit;
import com.tutorials.hackro.androiddev.domain.model.ResponseRedditDomain;
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
    private MapperResponseReddit mapperResponseReddit;
    private AssetsPropertyReader assetsPropertyReader;

    @Inject
    public DataRemote(@NonNull Retrofit retrofit, @NonNull MapperResponseReddit mapperResponseReddit, @NonNull AssetsPropertyReader assetsPropertyReader) {
        this.retrofit = retrofit;
        this.mapperResponseReddit = mapperResponseReddit;
        this.assetsPropertyReader = assetsPropertyReader;
    }

    @Override
    public Observable<ResponseRedditDomain> getListResult() {
        return retrofit.create(RetrofitServicesJsonPlaceHolder.class).getListResult(assetsPropertyReader.getProperties(BuildConfig.PROPERTIES_FILE).getProperty(BuildConfig.NUMBER_RESULT)).map(responseUserFakeDatas -> mapperResponseReddit.map(responseUserFakeDatas));
    }
}

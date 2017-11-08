package com.tutorials.hackro.androiddev.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tutorials.hackro.androiddev.BuildConfig;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponseUserFake;
import com.tutorials.hackro.androiddev.presentation.Utils.AssetsPropertyReader;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponsePhotoPresentation;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponseUserFakePresentation;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponseUserPresentation;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by hackro on 3/08/17.
 */

@Module public class AndroidDevModule {



    /**
     *
     * @param application
     * @return
     */
    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application application){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    /**
     *
     * @param application
     * @return
     */
    @Provides
    @Singleton
    Cache provideHtttpCache(Application application){
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(application.getCacheDir(),cacheSize);
    }

    /**
     *
     * @param cache
     * @return
     */
    @Provides
    @Singleton
    OkHttpClient provideOkhttpCLient(Cache cache){
        //OkHttpClient.Builder client = new OkHttpClient.Builder();

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS).build();

        //client.cache(cache);
        return client;
    }

    /**
     *
     * @return
     */
    @Provides
    @Singleton
    Gson provideGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setLenient();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    /**
     *
     * @param gson
     * @param okHttpClient
     * @return
     */
    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .client(okHttpClient)
                .build();
    }


    @Provides
    @Singleton
    MapperResponseUserFake provideMapperResponseUserFake(){
        return new MapperResponseUserFake();
    }

    @Provides
    @Singleton
    MapperResponseUserFakePresentation provideMapperResponseUserFakePresentation(){
        return new MapperResponseUserFakePresentation();
    }


    @Singleton
    @Provides
    AssetsPropertyReader providesAssetsPropertyReader(Application application){
        return new AssetsPropertyReader(application);
    }




}

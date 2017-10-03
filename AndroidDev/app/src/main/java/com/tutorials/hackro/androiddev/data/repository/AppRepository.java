package com.tutorials.hackro.androiddev.data.repository;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.data.remote.DataRemote;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponsePhoto;
import com.tutorials.hackro.androiddev.data.remote.mapper.MapperResponseUser;
import com.tutorials.hackro.androiddev.domain.model.ResponsePhotoDomain;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserDomain;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
//this class is the repository (providers data)
public class AppRepository implements DataSourceRepository {

    //data source// this interface is use in DataRemote

    //Local
    //Remote
    private MapperResponsePhoto mapperPhoto;
    private MapperResponseUser mapperUser;
    private DataRemote dataRemote;

    @Inject
    public AppRepository(@NonNull DataRemote dataRemote,@NonNull  MapperResponsePhoto mapperPhoto,@NonNull MapperResponseUser mapperUser) {
        this.dataRemote = dataRemote;
        this.mapperPhoto = mapperPhoto;
        this.mapperUser = mapperUser;
    }

    @Override
    public Observable<List<ResponsePost>> getListPost() {
        return dataRemote.getListPost();
    }

    @Override
    public Observable<List<ResponsePhotoDomain>> getListPhotos() {
        return dataRemote.getListPhotos().map(photo -> mapperPhoto.map(photo));
    }

    @Override
    public Observable<List<ResponseUserDomain>> getListUsers() {
        return dataRemote.getListUsers().map(user ->  mapperUser.map(user));
    }

}



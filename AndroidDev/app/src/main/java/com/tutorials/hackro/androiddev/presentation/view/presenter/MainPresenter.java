package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.Model.ResponsePhotoDomain;
import com.tutorials.hackro.androiddev.domain.Model.ResponseUserDomain;
import com.tutorials.hackro.androiddev.domain.usecase.GetListPhotos;
import com.tutorials.hackro.androiddev.domain.usecase.GetListPost;
import com.tutorials.hackro.androiddev.domain.usecase.GetListUsers;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponseUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserPresentation;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends  Presenter<MainPresenter.View>{

    private SharedPreferences sharedPreferences;
    private GetListPhotos getListPhotos;
    private GetListPost getListPost;
    private GetListUsers getListUsers;
    private MapperResponseUserPresentation mapperUserPresentation;

    @Inject
    public MainPresenter(SharedPreferences sharedPreferences,@NonNull GetListPost getListPost,@NonNull GetListPhotos getListPhotos,@NonNull GetListUsers getListUsers,@NonNull MapperResponseUserPresentation mapperUserPresentation){
        this.sharedPreferences = sharedPreferences;
        this.getListPost = getListPost;
        this.getListPhotos = getListPhotos;
        this.getListUsers = getListUsers;
        this.mapperUserPresentation = mapperUserPresentation;
    }


    @Override
    public void initialize() {
        super.initialize();
        getView().methodAMainActivity();
        //getListPost();
        //listPhotos();
        listUsers();
    }

    private void listUsers() {
        getListUsers.execute(new GetListUsersObservable());
    }

    private class GetListUsersObservable extends DefaultSubscriber<List<ResponseUserDomain>>{
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(List<ResponseUserDomain> responseUserDomains) {
            super.onNext(responseUserDomains);

            List<ResponseUserPresentation> listUsers = mapperUserPresentation.map(responseUserDomains);
            getView().showListUsers(listUsers);
            Log.e("size list Users: ", String.valueOf(listUsers.size()));
        }
    }

    private void listPhotos() {
        getListPhotos.execute(new GetListPhotosObservable());
    }

    private class  GetListPhotosObservable extends  DefaultSubscriber<List<ResponsePhotoDomain>>{
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(List<ResponsePhotoDomain> responsePhoto) {
            super.onNext(responsePhoto);

            //getView().showListPhotos(responsePhoto);
        }
    }

    public void getListPost(){
        getView().showLoading();
        getListPost.execute(new GetListPostObservable());
    }

    //Object the response type
    private final class GetListPostObservable extends DefaultSubscriber<List<ResponsePost>>{
        private  String responseString = "";
        @Override
        public void onCompleted() {
            super.onCompleted();
            getView().hideLoading();
            getView().showPosts(responseString);
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            e.printStackTrace();
            getView().hideLoading();
            getView().showError(e.getMessage());
        }

        @Override
        public void onNext(List<ResponsePost> responsePost) {
            super.onNext(responsePost);
            for (ResponsePost post : responsePost) {
                responseString += post.toString() +"\n";
            }

        }
    }


    @Override
    public void onItemOnClick(ResponsePhoto responsePhoto) {
        super.onItemOnClick(responsePhoto);
        getView().showPhotoDetail(responsePhoto.toString());
    }

    public interface View extends Presenter.View{
        void methodAMainActivity();
        void showPosts(String responseString);
        void showPhotoDetail(String details);
        void showListPhotos(List<ResponsePhoto> photoList);

        void showListUsers(List<ResponseUserPresentation> listUsers);
    }


}

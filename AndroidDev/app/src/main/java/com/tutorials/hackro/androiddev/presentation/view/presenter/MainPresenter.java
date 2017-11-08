package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;

import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;
import com.tutorials.hackro.androiddev.domain.usecase.GetListResult;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponseUserFakePresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponsePhotoPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserFakePresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.ResultPresentation;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends  Presenter<MainPresenter.View>{


    private GetListResult getListResult;
    private MapperResponseUserFakePresentation mapperResponseUserFake;

    @Inject
    public MainPresenter(@NonNull GetListResult getListResult,MapperResponseUserFakePresentation mapperResponseUserFake){
        this.getListResult = getListResult;
        this.mapperResponseUserFake = mapperResponseUserFake;
    }


    @Override
    public void initialize() {
        super.initialize();
        listResult();
    }


    private class GetListResultObservable extends DefaultSubscriber<ResponseUserFakeDomain>{
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(ResponseUserFakeDomain userFakeDomains) {
            super.onNext(userFakeDomains);
            ResponseUserFakePresentation listUsers = mapperResponseUserFake.map(userFakeDomains);
            getView().showListResult(listUsers.getResults());
        }
    }

    private void listResult() {
        getListResult.execute(new GetListResultObservable());
    }



    public void onItemOnClick(ResultPresentation responseUserFakePresentation) {
        getView().showPhotoDetail(responseUserFakePresentation.toString());
    }

    public interface View extends Presenter.View{
        void showPhotoDetail(String details);
        void showListResult(List<ResultPresentation> listUsers);
    }


}

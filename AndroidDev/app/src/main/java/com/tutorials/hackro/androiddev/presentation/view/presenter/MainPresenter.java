package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.model.ResponseRedditDomain;
import com.tutorials.hackro.androiddev.domain.usecase.GetListResult;
import com.tutorials.hackro.androiddev.presentation.mapper.MapperResponseRedditPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseRedditPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.ChildLayerPresentation;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends Presenter<MainPresenter.View> {


    private GetListResult getListResult;
    private MapperResponseRedditPresentation mapperResponseRedditPresentation;

    @Inject
    public MainPresenter(@NonNull GetListResult getListResult, MapperResponseRedditPresentation mapperResponseRedditPresentation) {
        this.getListResult = getListResult;
        this.mapperResponseRedditPresentation = mapperResponseRedditPresentation;
    }


    @Override
    public void initialize() {
        super.initialize();
        getView().hideToolbar();
        listResult();
    }


    private class GetListResultObservable extends DefaultSubscriber<ResponseRedditDomain> {
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(ResponseRedditDomain responseRedditDomain) {
            super.onNext(responseRedditDomain);

            ResponseRedditPresentation responseRedditPresentation = mapperResponseRedditPresentation.map(responseRedditDomain);
            List<ChildLayerPresentation> listChild = new ArrayList<>();

            for (ChildLayerPresentation child : responseRedditPresentation.getData().getChildren()){
                   // if (child.getData().getPreview()!=null && child.getData().getThumbnail()!=null && !child.getData().getThumbnail().equals(""))
                         listChild.add(child);
            }

            getView().showListResult(listChild);
        }
    }

    private void listResult() {
        getListResult.execute(new GetListResultObservable());
    }


    public void onItemOnClick(ChildLayerPresentation responseUserFakePresentation) {
        getView().showPhotoDetail(responseUserFakePresentation.toString());
    }

    public interface View extends Presenter.View {
        void showPhotoDetail(String details);

        void showListResult(List<ChildLayerPresentation> listUsers);

        void hideToolbar();
    }


}

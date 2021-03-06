package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.usecase.GetListResult;
import com.tutorials.hackro.androiddev.presentation.entity.ArticleDetails;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends Presenter<MainPresenter.View> {


    private GetListResult getListResult;
    private ArticleDetails articleDetails;


    @Inject public MainPresenter(@NonNull GetListResult getListResult,@NonNull ArticleDetails articleDetails) {
        this.getListResult = getListResult;
        this.articleDetails = articleDetails;
    }


    @Override
    public void initialize() {
        super.initialize();
        getView().hideToolbar();
        listResult();
    }


    private class GetListResultObservable extends DefaultSubscriber<ResponseRedditData> {
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(ResponseRedditData responseRedditData) {
            super.onNext(responseRedditData);

            List<ChildLayerData> listChild = new ArrayList<>();

            for (ChildLayerData child : responseRedditData.getData().getChildren()) {
                // if (child.getData().getPreview()!=null && child.getData().getThumbnail()!=null && !child.getData().getThumbnail().equals(""))
                listChild.add(child);
            }

            getView().showListResult(listChild);
        }
    }

    private void listResult() {
        getListResult.execute(new GetListResultObservable());
    }


    public void onItemOnClick(ChildLayerData responseUserFakePresentation) {
        setValuesArticle(responseUserFakePresentation);
        getView().showPhotoDetail(responseUserFakePresentation.toString());
    }

    private void setValuesArticle(ChildLayerData childLayerData) {
        articleDetails.setComments(String.valueOf(childLayerData.getData().getNumComments()));
        articleDetails.setTitle(childLayerData.getData().getTitle());
        articleDetails.setId_post(childLayerData.getData().getSubredditId());
        articleDetails.setUrlPicture(childLayerData.getData().getThumbnail());
        articleDetails.setScore(String.valueOf(childLayerData.getData().getScore()));
    }


    public interface View extends Presenter.View {
        void showPhotoDetail(String details);

        void showListResult(List<ChildLayerData> listUsers);

        void hideToolbar();
    }


}

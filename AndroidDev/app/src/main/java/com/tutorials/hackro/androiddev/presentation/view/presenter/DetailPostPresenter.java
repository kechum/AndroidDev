package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.usecase.GetListComments;
import com.tutorials.hackro.androiddev.domain.usecase.GetListResult;
import com.tutorials.hackro.androiddev.presentation.entity.ArticleDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class DetailPostPresenter extends Presenter<DetailPostPresenter.View> {


    private GetListComments getListComments;
    private ArticleDetails articleDetails;

    @Inject public DetailPostPresenter(@NonNull GetListComments getListComments,@NonNull ArticleDetails articleDetails) {
        this.getListComments = getListComments;
        this.articleDetails = articleDetails;
    }

    @Override public void initialize() {
        super.initialize();

        initHeaderActivity();
        initHeaderActivity();
        //getView().showError(articleDetails.toString());
        //loadListComments();

    }

    private void initHeaderActivity() {
        setValueTitleArticle(articleDetails.getTitle());
        setValueScoreArticle(articleDetails.getScore());
        setValuePictureArticle(articleDetails.getUrlPicture());
        setValueCommentsArticle(articleDetails.getComments());

    }

    private void setValueCommentsArticle(String comments) {
        getView().setValueCommentsArticle(comments);
    }

    private void setValuePictureArticle(String urlPicture) {
        getView().setValuePictureArticle(urlPicture);
    }

    private void setValueScoreArticle(String score) {
        getView().setValueScoreArticle(score);
    }

    private void setValueTitleArticle(String title) {
        getView().setValueTitleArticle(title);
    }


    private void loadListComments() {
        getListComments.execute(new getListCommentsObservable());
    }




    private class getListCommentsObservable extends DefaultSubscriber<Object>{
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onNext(Object o) {
            super.onNext(o);
        }
    }


    public interface View extends Presenter.View {


        void setValueCommentsArticle(String comments);

        void setValuePictureArticle(String urlPicture);

        void setValueScoreArticle(String score);

        void setValueTitleArticle(String title);
    }


}

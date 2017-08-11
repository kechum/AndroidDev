package com.tutorials.hackro.androiddev.presentation.view.presenter;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.model.ResponsePost;
import com.tutorials.hackro.androiddev.domain.DefaultSubscriber;
import com.tutorials.hackro.androiddev.domain.GetListPost;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by hackro on 3/08/17.
 */

public class MainPresenter extends  Presenter<MainPresenter.View>{

    private SharedPreferences sharedPreferences;
    private GetListPost getListPost;

    @Inject
    public MainPresenter(SharedPreferences sharedPreferences,@NonNull GetListPost getListPost){
        this.sharedPreferences = sharedPreferences;
        this.getListPost = getListPost;
    }


    @Override
    public void initialize() {
        super.initialize();
        getView().methodAMainActivity();
        getListPost();
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

    public interface View extends Presenter.View{
        void methodAMainActivity();
        void showPosts(String responseString);
    }


}

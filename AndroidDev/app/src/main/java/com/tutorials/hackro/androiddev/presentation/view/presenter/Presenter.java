package com.tutorials.hackro.androiddev.presentation.view.presenter;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;

/**
 * Created by hackro on 3/08/17.
 */


public class Presenter<T extends Presenter.View> {

    private T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }

    public void initialize() {

    }

    public void onItemOnClick(ResponsePhoto responsePhoto) {

    }

    public interface View {

        void showLoading();

        void hideLoading();

        void showError(String message);

    }
}


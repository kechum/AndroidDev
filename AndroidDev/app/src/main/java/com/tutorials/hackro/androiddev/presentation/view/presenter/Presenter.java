package com.tutorials.hackro.androiddev.presentation.view.presenter;

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


    public interface View {

        void showLoading();

        void hideLoading();

        void showError(String message);

    }
}


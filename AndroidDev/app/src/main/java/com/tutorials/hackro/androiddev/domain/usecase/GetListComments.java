package com.tutorials.hackro.androiddev.domain.usecase;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.repository.AppRepository;
import com.tutorials.hackro.androiddev.domain.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 22/08/17.
 */

public class GetListComments extends UseCase {

    private AppRepository repository;
    private String id_post;

    @Inject public GetListComments(@NonNull AppRepository repository) {
        this.repository = repository;
    }

    @Override protected Observable buildObservableUseCase() {
        return repository.getListComments(id_post);
    }

    public void setId_post(String id_post) {
        this.id_post = id_post;
    }
}

package com.tutorials.hackro.androiddev.domain.usecase;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.repository.AppRepository;
import com.tutorials.hackro.androiddev.domain.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 10/08/17.
 */
//this class execute the repository
public class GetListPost extends UseCase {

    private AppRepository repository;

    @Inject
    public GetListPost(@NonNull AppRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable buildObservableUseCase() {
        return repository.getListPost();
    }
}

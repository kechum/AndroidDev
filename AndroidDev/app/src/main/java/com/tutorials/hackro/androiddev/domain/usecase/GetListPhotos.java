package com.tutorials.hackro.androiddev.domain.usecase;

import android.support.annotation.NonNull;

import com.tutorials.hackro.androiddev.data.repository.AppRepository;
import com.tutorials.hackro.androiddev.domain.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 22/08/17.
 */

public class GetListPhotos extends UseCase {

    private AppRepository repository;

    @Inject
    public GetListPhotos(@NonNull AppRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable buildObservableUseCase() {
        return repository.getListPhotos();
    }
}

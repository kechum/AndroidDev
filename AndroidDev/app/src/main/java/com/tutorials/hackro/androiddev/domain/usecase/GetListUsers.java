package com.tutorials.hackro.androiddev.domain.usecase;

import com.tutorials.hackro.androiddev.data.repository.AppRepository;
import com.tutorials.hackro.androiddev.domain.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by hackro on 1/10/17.
 */

public class GetListUsers extends UseCase {

    private AppRepository repository;
    @Inject
    public GetListUsers(AppRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable buildObservableUseCase() {
        return repository.getListUsers();
    }

}

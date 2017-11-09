package com.tutorials.hackro.androiddev.domain;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Created by hackro on 10/08/17.
 */

public abstract class UseCase {

    private Subscription subscription = Subscriptions.empty();

    public UseCase() {
    }


    public void execute(Subscriber UseCaseSubscriber) {
        this.subscription = this.buildObservableUseCase()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(UseCaseSubscriber);
    }


    public void unsubsrcriber() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }


    protected abstract Observable buildObservableUseCase();
}

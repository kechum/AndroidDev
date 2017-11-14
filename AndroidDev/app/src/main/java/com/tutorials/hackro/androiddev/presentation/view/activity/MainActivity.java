package com.tutorials.hackro.androiddev.presentation.view.activity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.presentation.BaseActivity;
import com.tutorials.hackro.androiddev.presentation.HomeApplication;
import com.tutorials.hackro.androiddev.presentation.adapter.PhotosAdapter;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainPresenter.View {

    @Inject MainPresenter presenter;

    @BindView(R.id.recycler_photos) RecyclerView recycler_photos;

    private PhotosAdapter photosAdapter;

    private StaggeredGridLayoutManager layoutManager;

    @Override public void initializeView() {
        super.initializeView();
        initializeDagger();
        initializePresenter();
        initAdapter();
        initLayoutManager();
        initRecycler();
        presenter.initialize();
    }

    private void initLayoutManager() {
        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
    }


    private void initRecycler() {
        recycler_photos.setLayoutManager(layoutManager);
        recycler_photos.setAdapter(photosAdapter);
    }

    private void initAdapter() {
        photosAdapter = new PhotosAdapter(presenter, getApplicationContext());
    }

    private void initializeDagger() {
        HomeApplication app = (HomeApplication) getApplication();
        app.getAppComponent().inject(this);
    }

    private void initializePresenter() {
        presenter.setView(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void showPhotoDetail(String details) {
        startActivity(new Intent(this,DetailPostActivity.class));
    }

    @Override
    public void showListResult(List<ChildLayerData> listUsers) {
        photosAdapter.setListResult(listUsers);
        photosAdapter.notifyDataSetChanged();
    }

    @Override
    public void hideToolbar() {
        getSupportActionBar().hide();
    }


    @Override
    public void showProgres() {
        Log.e("hide ", "Progress");
    }

    @Override
    public void hideProgress() {
        Log.e("hide ", "Progress");
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setValuesFabric() {
    }
}

package com.tutorials.hackro.androiddev.presentation.view.activity;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.presentation.BaseActivity;
import com.tutorials.hackro.androiddev.presentation.HomeApplication;
import com.tutorials.hackro.androiddev.presentation.adapter.PhotosAdapter;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainPresenter.View{

    @Inject
    MainPresenter presenter;

    @BindView(R.id.recycler_photos)
    RecyclerView recycler_photos;

    private PhotosAdapter photosAdapter;

    private GridLayoutManager layout;

    @Override
    public void initView() {
        super.initView();
        initializeDagger();
        initializePresenter();
        initAdapter();
        initRecycler();
        presenter.initialize();
    }




    private void initRecycler() {
        layout = new GridLayoutManager(this,3);
        recycler_photos.setLayoutManager(layout);
        recycler_photos.setAdapter(photosAdapter);
    }

    private void initAdapter() {
        photosAdapter = new PhotosAdapter(presenter);
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
    public void methodAMainActivity() {
        Toast.makeText(this,"Hola Ali",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPosts(String responsePost) {
        Toast.makeText(this,responsePost.toString() ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPhotoDetail(String details) {
        Toast.makeText(this,details ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showListPhotos(List<ResponsePhoto> photoList) {
        photosAdapter.setListPhotos(photoList);
        photosAdapter.notifyDataSetChanged();
    }

    @Override
    public void showListUsers(List<ResponseUserPresentation> listUsers) {
        Log.e("results users:       ",listUsers.toString());
        Toast.makeText(this,listUsers.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        Log.e("hide ","Progress");
    }
    @Override
    public void hideLoading() {
        Log.e("hide ","Progress");
    }
    @Override
    public void showError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}

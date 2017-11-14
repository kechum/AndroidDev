package com.tutorials.hackro.androiddev.presentation.view.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.presentation.BaseActivity;
import com.tutorials.hackro.androiddev.presentation.HomeApplication;
import com.tutorials.hackro.androiddev.presentation.adapter.PhotosAdapter;
import com.tutorials.hackro.androiddev.presentation.view.presenter.DetailPostPresenter;

import javax.inject.Inject;

import butterknife.BindView;

public class DetailPostActivity extends BaseActivity implements DetailPostPresenter.View {

    @Inject DetailPostPresenter presenter;
    @BindView(R.id.collapsing_toolbar) CollapsingToolbarLayout mCollapsingToolbar;
    @BindView(R.id.rv_comments) RecyclerView rv_comments;
    @BindView(R.id.picture_article) ImageView picture_article;
    //private CommentsAdapter commentsAdapter;


    @Override public void initializeView() {
        super.initializeView();
        initializeDagger();
        initializePresenter();
        initAdapter();
        hideToolbar();
        initRecycler();
        presenter.initialize();
    }

    private void hideToolbar() {
        getSupportActionBar().hide();
    }


    private void initRecycler() {
        //rv_comments.setLayoutManager(new LinearLayoutManager(this));
        //rv_comments.setAdapter(commentsAdapter);
    }

    private void initAdapter() {
        //commentsAdapter = new CommentsAdapter(presenter, getApplicationContext());
    }

    private void initializeDagger() {
        HomeApplication app = (HomeApplication) getApplication();
        app.getAppComponent().inject(this);
    }

    private void initializePresenter() {
        presenter.setView(this);
    }

    @Override public void showProgres() {

    }

    @Override public void hideProgress() {

    }

    @Override public void showError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override public void setValuesFabric() {}

    @Override protected int getLayoutId() {
        return R.layout.activity_detail_post;
    }

    @Override
    public void setValueCommentsArticle(String comments) {

    }

    @Override
    public void setValuePictureArticle(String urlPicture) {
        Glide.with(this)
                .load(urlPicture)
                .placeholder(R.mipmap.question)
                .skipMemoryCache(true)
                .into(picture_article);
    }

    @Override
    public void setValueScoreArticle(String score) {

    }

    @Override
    public void setValueTitleArticle(String title) {
        mCollapsingToolbar.setTitle(title);
        mCollapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        mCollapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
    }
}

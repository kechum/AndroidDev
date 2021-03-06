package com.tutorials.hackro.androiddev.presentation.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosViewHolder extends RecyclerView.ViewHolder {

    private MainPresenter presenter;

    private View itemView;

    private Random rnd;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.vote_up)
    TextView vote_up;

    @BindView(R.id.comments)
    TextView comments;

    @BindView(R.id.photo)
    ImageView photo;

    @BindView(R.id.cardview)
    CardView cardview;


    public PhotosViewHolder(View itemView, MainPresenter presenter) {
        super(itemView);
        this.itemView = itemView;
        this.presenter = presenter;
        rnd = new Random();
        ButterKnife.bind(this, itemView);
    }


    public void renderView(ChildLayerData responsePhoto) {
        onItemOnClick(responsePhoto);
        renderTitle(responsePhoto.getData().getTitle() != null ? responsePhoto.getData().getTitle() : "");
        renderImage(responsePhoto.getData().getThumbnail());
        renderVotes(String.valueOf(responsePhoto.getData().getScore()));
        renderComments(String.valueOf(responsePhoto.getData().getNumComments()));

    }

    private void renderComments(String num_comments) {
        comments.setText(num_comments);
    }

    private void renderVotes(String score) {
        vote_up.setText(score);
    }

    private void renderImage(String thumbnailUrl) {
        Glide.with(getContext())
                .load(thumbnailUrl)
                .placeholder(R.mipmap.question)
                .skipMemoryCache(true)
                .into(photo);
    }

    private void renderTitle(String title) {
        this.title.setText(title);
    }

    private Context getContext() {
        return itemView.getContext();
    }

    private void onItemOnClick(final ChildLayerData responseUserFakePresentation) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onItemOnClick(responseUserFakePresentation);
            }
        });
    }
}

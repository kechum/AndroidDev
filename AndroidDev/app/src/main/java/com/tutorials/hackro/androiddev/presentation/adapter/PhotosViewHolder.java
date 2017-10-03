package com.tutorials.hackro.androiddev.presentation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponsePhotoPresentation;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosViewHolder  extends RecyclerView.ViewHolder{

    private MainPresenter presenter;

    private View itemView;

    @BindView(R.id.title) TextView title;

    @BindView(R.id.album) TextView album;

    @BindView(R.id.photo) ImageView photo;

    public PhotosViewHolder(View itemView,MainPresenter presenter) {
        super(itemView);
        this.itemView = itemView;
        this.presenter = presenter;
        ButterKnife.bind(this,itemView);
    }


    public void renderView(ResponsePhotoPresentation responsePhoto){
        onItemOnClick(responsePhoto);
        renderTitle(responsePhoto.getTitle()!=null?responsePhoto.getTitle():"");
        renderAlbum(String.valueOf(responsePhoto.getAlbumId()));
        renderImage(responsePhoto.getThumbnailUrl()!=null?responsePhoto.getThumbnailUrl():"");
    }

    private void renderImage(String thumbnailUrl) {
        Glide.with(getContext())
                .load(thumbnailUrl)
                .placeholder(R.mipmap.load_image)
                .skipMemoryCache(true)
                .into(photo);
    }

    private void renderAlbum(String album) {
        this.album.setText(album);
    }

    private void renderTitle(String title) {
        this.title.setText(title);
    }


    private Context getContext(){
        return itemView.getContext();
    }


    private void onItemOnClick(final ResponsePhotoPresentation responsePhoto){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onItemOnClick(responsePhoto);
            }
        });
    }
}

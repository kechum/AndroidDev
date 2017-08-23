package com.tutorials.hackro.androiddev.presentation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.presentation.view.presenter.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosViewHolder  extends RecyclerView.ViewHolder{

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.album)
    TextView album;

    @BindView(R.id.photo)
    ImageView photo;

    private View itemView;

    public PhotosViewHolder(View itemView,Presenter presenter) {
        super(itemView);
        this.itemView = itemView;
        this.presenter = presenter;
        ButterKnife.bind(this,itemView);
    }


    public void renderView(ResponsePhoto responsePhoto){
        onItemOnClick(responsePhoto);
        renderTitle(responsePhoto.getTitle()!=null?responsePhoto.getTitle():"");
        renderAlbum(String.valueOf(responsePhoto.getAlbumId()));
        renderImage(responsePhoto.getThumbnailUrl()!=null?responsePhoto.getThumbnailUrl():"");
    }

    private void renderImage(String thumbnailUrl) {
        Glide.with(getContext())
                .load(thumbnailUrl)
                .placeholder(R.mipmap.ic_launcher_round)
                .skipMemoryCache(true)
                .into(photo);
    }

    private void renderAlbum(String album) {
        this.album.setText(album);
    }

    private void renderTitle(String title) {
        this.title.setText(title);
    }

    private Presenter presenter;

    private Context getContext(){
        return itemView.getContext();
    }


    private void onItemOnClick(final ResponsePhoto responsePhoto){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onItemOnClick(responsePhoto);
            }
        });
    }
}

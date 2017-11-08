package com.tutorials.hackro.androiddev.presentation.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.ResultPresentation;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosViewHolder  extends RecyclerView.ViewHolder{

    private MainPresenter presenter;

    private View itemView;

    private Random rnd;

    @BindView(R.id.name) TextView name;

    @BindView(R.id.title) TextView title;

    @BindView(R.id.photo) ImageView photo;

    @BindView(R.id.cardview) CardView cardview;

    public PhotosViewHolder(View itemView,MainPresenter presenter) {
        super(itemView);
        this.itemView = itemView;
        this.presenter = presenter;
        rnd = new Random();
        ButterKnife.bind(this,itemView);
    }


    public void renderView(ResultPresentation responsePhoto){
        onItemOnClick(responsePhoto);
        renderName(responsePhoto.getName().getFirst() + " " + responsePhoto.getName().getLast() !=null?responsePhoto.getName().getFirst() + " " + responsePhoto.getName().getLast():"");
        renderTitle(responsePhoto.getName().getTitle().toUpperCase());
        renderImage(responsePhoto.getPicture().getLarge()!=null?responsePhoto.getPicture().getLarge():"");
    }

    private void renderImage(String thumbnailUrl) {
        Glide.with(getContext())
                .load(thumbnailUrl)
                .placeholder(R.mipmap.load_image)
                .skipMemoryCache(true)
                .into(photo);
    }

    private void renderTitle(String title) {
        this.title.setText(title);
        setColorTitle();
    }

    private void setColorTitle() {
        this.title.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

    }

    private void renderName(String title) {
        this.name.setText(title);
        setColorName();
    }

    private void setColorName() {
        this.name.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
    }


    private Context getContext(){
        return itemView.getContext();
    }


    private void onItemOnClick(final ResultPresentation responseUserFakePresentation){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onItemOnClick(responseUserFakePresentation);
            }
        });
    }
}

package com.tutorials.hackro.androiddev.presentation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.presentation.view.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ChildLayerData> listResult;
    private MainPresenter presenter;
    private Context context;


    public PhotosAdapter(MainPresenter presenter, Context context) {
        listResult = new ArrayList<>();
        this.presenter = presenter;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo, parent, false);
        return new PhotosViewHolder(view, presenter);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PhotosViewHolder photoHolder = (PhotosViewHolder) holder;
        photoHolder.renderView(listResult.get(position));
        setAnimation(((PhotosViewHolder) holder).cardview);

    }

    @Override
    public int getItemCount() {
        return listResult.size();
    }

    public void setListResult(List<ChildLayerData> listResult) {
        this.listResult = listResult;
    }

    private void setAnimation(View viewToAnimate) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
        viewToAnimate.startAnimation(animation);
    }

}

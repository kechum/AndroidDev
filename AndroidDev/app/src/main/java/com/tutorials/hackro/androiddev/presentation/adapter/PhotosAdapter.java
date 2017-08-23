package com.tutorials.hackro.androiddev.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hackro.androiddev.R;
import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.presentation.view.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackro on 22/08/17.
 */

public class PhotosAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ResponsePhoto> listPhotos;
    private Presenter presenter;


    public PhotosAdapter(Presenter presenter) {
        listPhotos = new ArrayList<>();
        this.presenter = presenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo,parent,false);
        return new PhotosViewHolder(view,presenter);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PhotosViewHolder photoHolder = (PhotosViewHolder) holder;
        photoHolder.renderView(listPhotos.get(position));
    }

    @Override
    public int getItemCount() {
        return listPhotos.size();
    }

    public void setListPhotos(List<ResponsePhoto> listPhotos) {
        this.listPhotos = listPhotos;
    }
}

package com.tutorials.hackro.androiddev.presentation.mapper;


import com.tutorials.hackro.androiddev.data.remote.mapper.Mapper;
import com.tutorials.hackro.androiddev.domain.model.ResponseRedditDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.ChildLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.DataLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.Data_LayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.ImageLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.PreviewLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.SourceLayerDomain;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseRedditPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.ChildLayerPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.DataLayerPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.Data_LayerPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.ImageLayerPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.PreviewLayerPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.SourceLayerPresentation;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseRedditPresentation extends Mapper<ResponseRedditDomain, ResponseRedditPresentation> {

    @Override
    public ResponseRedditPresentation map(ResponseRedditDomain value) {

        ResponseRedditPresentation response = new ResponseRedditPresentation();
        DataLayerPresentation data = new DataLayerPresentation();
        ChildLayerPresentation childLayer;
        List<ChildLayerPresentation> listChild = new ArrayList<>();
        Data_LayerPresentation dataTemp;
        PreviewLayerPresentation preview;
        SourceLayerPresentation source;
        ImageLayerPresentation imageLayer;
        List<ImageLayerPresentation> imageLayerList = new ArrayList<>();

        for (ChildLayerDomain child : value.getData().getChildren()) {

            childLayer = new ChildLayerPresentation();
            dataTemp = new Data_LayerPresentation();

            dataTemp.setThumbnail(child.getData().getThumbnail());
            preview = new PreviewLayerPresentation();
            dataTemp.setTitle(child.getData().getTitle());

            if(child.getData().getPreview() != null) {
                preview.setEnabled(child.getData().getPreview().isEnabled());
                for (ImageLayerDomain image : child.getData().getPreview().getImages()) {
                    imageLayer = new ImageLayerPresentation();
                    source = new SourceLayerPresentation();

                    source.setHeight(image.getSource().getHeight());
                    source.setUrl(image.getSource().getUrl());
                    source.setWidth(image.getSource().getWidth());
                    imageLayer.setSource(source);

                    imageLayerList.add(imageLayer);

                }

                preview.setImages(imageLayerList);
                dataTemp.setPreview(preview);
            }

            childLayer.setData(dataTemp);
            listChild.add(childLayer);
        }

        data.setChildren(listChild);
        response.setData(data);

        return response;
    }

    @Override
    public ResponseRedditDomain reverseMap(ResponseRedditPresentation value) {

        ResponseRedditDomain response = new ResponseRedditDomain();
        DataLayerDomain data = new DataLayerDomain();
        ChildLayerDomain childLayer;
        List<ChildLayerDomain> listChild = new ArrayList<>();
        Data_LayerDomain dataTemp;
        PreviewLayerDomain preview;
        SourceLayerDomain source;
        ImageLayerDomain imageLayer;
        List<ImageLayerDomain> imageLayerList = new ArrayList<>();

        for (ChildLayerPresentation child : value.getData().getChildren()) {

            childLayer = new ChildLayerDomain();
            dataTemp = new Data_LayerDomain();

            dataTemp.setThumbnail(child.getData().getThumbnail());
            preview = new PreviewLayerDomain();

            preview.setEnabled(child.getData().getPreview().isEnabled());
            for (ImageLayerPresentation image: child.getData().getPreview().getImages()){
                imageLayer = new ImageLayerDomain();
                source = new SourceLayerDomain();

                source.setHeight(image.getSource().getHeight());
                source.setUrl(image.getSource().getUrl());
                source.setWidth(image.getSource().getWidth());
                imageLayer.setSource(source);

                imageLayerList.add(imageLayer);

            }

            preview.setImages(imageLayerList);
            dataTemp.setPreview(preview);


            childLayer.setData(dataTemp);
            listChild.add(childLayer);
        }

        data.setChildren(listChild);
        response.setData(data);

        return response;
    }
}

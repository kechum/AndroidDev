package com.tutorials.hackro.androiddev.data.remote.mapper;


import com.tutorials.hackro.androiddev.data.model.ResponseRedditData;
import com.tutorials.hackro.androiddev.data.model.reddit.ChildLayerData;
import com.tutorials.hackro.androiddev.data.model.reddit.DataLayerData;
import com.tutorials.hackro.androiddev.data.model.reddit.Data_LayerData;
import com.tutorials.hackro.androiddev.data.model.reddit.ImageLayerData;
import com.tutorials.hackro.androiddev.data.model.reddit.PreviewLayerData;
import com.tutorials.hackro.androiddev.data.model.reddit.SourceLayerData;
import com.tutorials.hackro.androiddev.domain.model.ResponseRedditDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.ChildLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.DataLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.Data_LayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.ImageLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.PreviewLayerDomain;
import com.tutorials.hackro.androiddev.domain.model.reddit.SourceLayerDomain;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseReddit extends Mapper<ResponseRedditData, ResponseRedditDomain> {

    @Override
    public ResponseRedditDomain map(ResponseRedditData value) {

        ResponseRedditDomain response = new ResponseRedditDomain();
        DataLayerDomain data = new DataLayerDomain();
        ChildLayerDomain childLayer;
        List<ChildLayerDomain> listChild = new ArrayList<>();
        Data_LayerDomain dataTemp;
        PreviewLayerDomain preview;
        SourceLayerDomain source;
        ImageLayerDomain imageLayer;
        List<ImageLayerDomain> imageLayerList = new ArrayList<>();

        for (ChildLayerData child : value.getData().getChildren()) {

            childLayer = new ChildLayerDomain();
            dataTemp = new Data_LayerDomain();

            dataTemp.setThumbnail(child.getData().getThumbnail());
            preview = new PreviewLayerDomain();
            dataTemp.setTitle(child.getData().getTitle());
            if(child.getData().getPreview() != null){
                preview.setEnabled(child.getData().getPreview().isEnabled());
                for (ImageLayerData image: child.getData().getPreview().getImages()){
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

            }


            childLayer.setData(dataTemp);
            listChild.add(childLayer);
        }

        data.setChildren(listChild);
        response.setData(data);

        return response;
    }

    @Override
    public ResponseRedditData reverseMap(ResponseRedditDomain value) {
        ResponseRedditData response = new ResponseRedditData();
        DataLayerData data = new DataLayerData();
        ChildLayerData childLayer;
        List<ChildLayerData> listChild = new ArrayList<>();
        Data_LayerData dataTemp;
        PreviewLayerData preview;
        SourceLayerData source;
        ImageLayerData imageLayer;
        List<ImageLayerData> imageLayerList = new ArrayList<>();

        for (ChildLayerDomain child : value.getData().getChildren()) {

            childLayer = new ChildLayerData();
            dataTemp = new Data_LayerData();

            dataTemp.setThumbnail(child.getData().getThumbnail());
            preview = new PreviewLayerData();
            dataTemp.setTitle(child.getData().getTitle());

            preview.setEnabled(child.getData().getPreview().isEnabled());
            for (ImageLayerDomain image: child.getData().getPreview().getImages()){
                imageLayer = new ImageLayerData();
                source = new SourceLayerData();

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

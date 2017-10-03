package com.tutorials.hackro.androiddev.presentation.mapper;

import com.tutorials.hackro.androiddev.data.remote.mapper.Mapper;
import com.tutorials.hackro.androiddev.domain.model.ResponsePhotoDomain;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponsePhotoPresentation;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponsePhotoPresentation extends Mapper<ResponsePhotoDomain,ResponsePhotoPresentation> {


    @Override
    public ResponsePhotoPresentation map(ResponsePhotoDomain value) {

        ResponsePhotoPresentation result = new ResponsePhotoPresentation();

        result.setAlbumId(value.getAlbumId());
        result.setId(value.getId());
        result.setThumbnailUrl(value.getThumbnailUrl());
        result.setUrl(value.getUrl());

        return  result;
    }

    @Override
    public ResponsePhotoDomain reverseMap(ResponsePhotoPresentation value) {

        ResponsePhotoDomain result = new ResponsePhotoDomain();

        result.setAlbumId(value.getAlbumId());
        result.setId(value.getId());
        result.setThumbnailUrl(value.getThumbnailUrl());
        result.setUrl(value.getUrl());

        return  result;
    }
}

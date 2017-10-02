package com.tutorials.hackro.androiddev.data.remote.mapper;

import com.tutorials.hackro.androiddev.data.model.ResponsePhoto;
import com.tutorials.hackro.androiddev.domain.Model.ResponsePhotoDomain;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponsePhoto extends Mapper<ResponsePhoto,ResponsePhotoDomain> {

    @Override
    public ResponsePhotoDomain map(ResponsePhoto value) {
        ResponsePhotoDomain result = new ResponsePhotoDomain();
        result.setId(value.getId());
        result.setAlbumId(value.getAlbumId());
        result.setThumbnailUrl(value.getThumbnailUrl());
        result.setUrl(value.getUrl());
        result.setTitle(value.getTitle());
        return result;
    }

    @Override
    public ResponsePhoto reverseMap(ResponsePhotoDomain value) {
        ResponsePhoto result = new ResponsePhoto();
        result.setId(value.getId());
        result.setAlbumId(value.getAlbumId());
        result.setThumbnailUrl(value.getThumbnailUrl());
        result.setUrl(value.getUrl());
        return result;
    }
}

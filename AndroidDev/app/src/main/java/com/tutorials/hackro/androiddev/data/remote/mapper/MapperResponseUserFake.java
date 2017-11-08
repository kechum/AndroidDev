package com.tutorials.hackro.androiddev.data.remote.mapper;

import com.tutorials.hackro.androiddev.data.model.ResponseUserFakeData;
import com.tutorials.hackro.androiddev.data.model.userfake.IdData;
import com.tutorials.hackro.androiddev.data.model.userfake.InfoData;
import com.tutorials.hackro.androiddev.data.model.userfake.LocationData;
import com.tutorials.hackro.androiddev.data.model.userfake.NameData;
import com.tutorials.hackro.androiddev.data.model.userfake.PictureData;
import com.tutorials.hackro.androiddev.data.model.userfake.ResultData;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.IdDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.InfoDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.LocationDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.NameDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.PictureDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.ResultDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseUserFake extends Mapper<ResponseUserFakeData,ResponseUserFakeDomain> {

    @Override
    public ResponseUserFakeDomain map(ResponseUserFakeData value) {
        ResponseUserFakeDomain resultUser = new ResponseUserFakeDomain();

        InfoDomain info = new InfoDomain();

        info.setPage(value.getInfo().getPage());
        info.setResults(value.getInfo().getResults());
        info.setSeed(value.getInfo().getSeed());
        info.setVersion(value.getInfo().getVersion());

        resultUser.setInfo(info);


        List<ResultDomain> listResult = new ArrayList<>();

        for (ResultData r : value.getResults()){
            ResultDomain result = new ResultDomain();
            result = new ResultDomain();

            PictureDomain pic = new PictureDomain();
            pic.setLarge(r.getPicture().getLarge());
            pic.setMedium(r.getPicture().getMedium());
            pic.setThumbnail(r.getPicture().getThumbnail());
            result.setPicture(pic);

            result.setGender(r.getGender());

                NameDomain name = new NameDomain();
                name.setFirst(r.getName().getFirst());
                name.setLast(r.getName().getLast());
                name.setTitle(r.getName().getTitle());

            result.setName(name);

                LocationDomain location = new LocationDomain();
                    location.setCity(r.getLocation().getCity());
                    location.setPostcode(r.getLocation().getPostcode());
                    location.setState(r.getLocation().getState());
                    location.setStreet(r.getLocation().getStreet());


            result.setLocation(location);

            result.setEmail(r.getEmail());
            result.setDob(r.getDob());
            result.setRegistered(r.getRegistered());
            result.setPhone(r.getPhone());
            result.setCell(r.getCell());
                IdDomain id = new IdDomain();
                    id.setName(r.getId().getName());
                    id.setValue(r.getId().getValue());

            result.setId(id);
            result.setNat(r.getNat());

            listResult.add(result);
        }

        resultUser.setResults(listResult);

        return resultUser;
    }

    @Override
    public ResponseUserFakeData reverseMap(ResponseUserFakeDomain value) {

        ResponseUserFakeData resultUser = new ResponseUserFakeData();

        InfoData info = new InfoData();

        info.setPage(value.getInfo().getPage());
        info.setResults(value.getInfo().getResults());
        info.setSeed(value.getInfo().getSeed());
        info.setVersion(value.getInfo().getVersion());

        resultUser.setInfo(info);


        List<ResultData> listResult = new ArrayList<>();

        for (ResultDomain r : value.getResults()){
            ResultData result = new ResultData();
            result = new ResultData();
            result.setGender(r.getGender());

            NameData name = new NameData();
            name.setFirst(r.getName().getFirst());
            name.setLast(r.getName().getLast());
            name.setTitle(r.getName().getTitle());

            result.setName(name);

            LocationData location = new LocationData();
            location.setCity(r.getLocation().getCity());
            location.setPostcode(r.getLocation().getPostcode());
            location.setState(r.getLocation().getState());
            location.setStreet(r.getLocation().getStreet());


            result.setLocation(location);

            result.setEmail(r.getEmail());
            result.setDob(r.getDob());
            result.setRegistered(r.getRegistered());
            result.setPhone(r.getPhone());
            result.setCell(r.getCell());
            IdData id = new IdData();
            id.setName(r.getId().getName());
            id.setValue(r.getId().getValue());

            result.setId(id);
            result.setNat(r.getNat());

            listResult.add(result);
        }

        resultUser.setResults(listResult);

        return resultUser;
    }
}

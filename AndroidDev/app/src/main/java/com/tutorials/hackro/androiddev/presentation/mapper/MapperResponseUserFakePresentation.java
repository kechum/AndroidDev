package com.tutorials.hackro.androiddev.presentation.mapper;

import com.tutorials.hackro.androiddev.data.remote.mapper.Mapper;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserFakeDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.IdDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.InfoDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.LocationDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.NameDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.ResultDomain;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserFakePresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.IdPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.InfoPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.LocationPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.NamePresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.ResultPresentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseUserFakePresentation extends Mapper<ResponseUserFakeDomain,ResponseUserFakePresentation> {

    @Override
    public ResponseUserFakePresentation map(ResponseUserFakeDomain value) {
        ResponseUserFakePresentation resultUser = new ResponseUserFakePresentation();

        InfoPresentation info = new InfoPresentation();

        info.setPage(value.getInfo().getPage());
        info.setResults(value.getInfo().getResults());
        info.setSeed(value.getInfo().getSeed());
        info.setVersion(value.getInfo().getVersion());

        resultUser.setInfo(info);


        List<ResultPresentation> listResult = new ArrayList<>();

        for (ResultDomain r : value.getResults()){
            ResultPresentation result = new ResultPresentation();
            result = new ResultPresentation();
            result.setGender(r.getGender());

            NamePresentation name = new NamePresentation();
            name.setFirst(r.getName().getFirst());
            name.setLast(r.getName().getLast());
            name.setTitle(r.getName().getTitle());

            result.setName(name);

            LocationPresentation location = new LocationPresentation();
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
            IdPresentation id = new IdPresentation();
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
    public ResponseUserFakeDomain reverseMap(ResponseUserFakePresentation value) {
        ResponseUserFakeDomain resultUser = new ResponseUserFakeDomain();

        InfoDomain info = new InfoDomain();

        info.setPage(value.getInfo().getPage());
        info.setResults(value.getInfo().getResults());
        info.setSeed(value.getInfo().getSeed());
        info.setVersion(value.getInfo().getVersion());

        resultUser.setInfo(info);


        List<ResultDomain> listResult = new ArrayList<>();

        for (ResultPresentation r : value.getResults()){
            ResultDomain result = new ResultDomain();
            result = new ResultDomain();
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
}

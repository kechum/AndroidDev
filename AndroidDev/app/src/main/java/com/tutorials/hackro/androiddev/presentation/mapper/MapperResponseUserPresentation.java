package com.tutorials.hackro.androiddev.presentation.mapper;

import com.tutorials.hackro.androiddev.data.remote.mapper.Mapper;
import com.tutorials.hackro.androiddev.domain.model.ResponseUserDomain;
import com.tutorials.hackro.androiddev.domain.model.User.AddressUserDomain;
import com.tutorials.hackro.androiddev.domain.model.User.CompanyDomain;
import com.tutorials.hackro.androiddev.presentation.view.entity.ResponseUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.User.AddressUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.User.CompanyPresentation;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseUserPresentation extends Mapper<ResponseUserDomain,ResponseUserPresentation> {




    @Override
    public ResponseUserPresentation map(ResponseUserDomain value) {
        ResponseUserPresentation result = new ResponseUserPresentation();
        result.setEmail(value.getEmail());
        result.setId(value.getId());
        result.setPhone(value.getPhone());
        result.setWebsite(value.getWebsite());
        result.setName(value.getName());
        result.setUsername(value.getUsername());

        AddressUserPresentation addres = new AddressUserPresentation();
        addres.setCity(value.getAddress().getCity());
        addres.setStreet(value.getAddress().getStreet());

        result.setAddress(addres);

        CompanyPresentation company = new CompanyPresentation();
        company.setBs(value.getCompanyDomain().getBs());
        company.setCatchPhrase(value.getCompanyDomain().getCatchPhrase());
        company.setName(value.getCompanyDomain().getName());
        result.setCompanyPresentation(company);

        return result;

    }

    @Override
    public ResponseUserDomain reverseMap(ResponseUserPresentation value) {
        ResponseUserDomain result = new ResponseUserDomain();
        result.setEmail(value.getEmail());
        result.setId(value.getId());
        result.setPhone(value.getPhone());
        result.setWebsite(value.getWebsite());
        result.setName(value.getName());
        result.setUsername(value.getUsername());

        AddressUserDomain addres = new AddressUserDomain();
        addres.setCity(value.getAddress().getCity());
        addres.setStreet(value.getAddress().getStreet());

        result.setAddress(addres);

        CompanyDomain company = new CompanyDomain();
        company.setBs(value.getCompanyPresentation().getBs());
        company.setCatchPhrase(value.getCompanyPresentation().getCatchPhrase());
        company.setName(value.getCompanyPresentation().getName());
        result.setCompanyDomain(company);

        return result;
    }
}

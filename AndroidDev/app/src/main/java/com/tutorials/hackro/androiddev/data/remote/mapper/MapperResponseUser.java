package com.tutorials.hackro.androiddev.data.remote.mapper;

import com.tutorials.hackro.androiddev.data.model.ResponseUser;
import com.tutorials.hackro.androiddev.data.model.User.AddressUser;
import com.tutorials.hackro.androiddev.data.model.User.Company;
import com.tutorials.hackro.androiddev.domain.Model.ResponseUserDomain;
import com.tutorials.hackro.androiddev.domain.Model.User.AddressUserDomain;
import com.tutorials.hackro.androiddev.domain.Model.User.CompanyDomain;

/**
 * Created by hackro on 1/10/17.
 */

public class MapperResponseUser extends Mapper<ResponseUser,ResponseUserDomain> {


    @Override
    public ResponseUserDomain map(ResponseUser value) {
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
            company.setBs(value.getCompany().getBs());
            company.setCatchPhrase(value.getCompany().getCatchPhrase());
            company.setName(value.getCompany().getName());
        result.setCompanyDomain(company);

        return result;
    }

    @Override
    public ResponseUser reverseMap(ResponseUserDomain value) {
        ResponseUser result = new ResponseUser();
        result.setEmail(value.getEmail());
        result.setId(value.getId());
        result.setPhone(value.getPhone());
        result.setWebsite(value.getWebsite());
        result.setName(value.getName());
        result.setUsername(value.getUsername());

        AddressUser addres = new AddressUser();
        addres.setCity(value.getAddress().getCity());
        addres.setStreet(value.getAddress().getStreet());

        result.setAddress(addres);

        Company company = new Company();
        company.setBs(value.getCompanyDomain().getBs());
        company.setCatchPhrase(value.getCompanyDomain().getCatchPhrase());
        company.setName(value.getCompanyDomain().getName());
        result.setCompany(company);

        return result;
    }
}

package com.realestate.service;

import com.realestate.model.Country;
import com.realestate.model.Status;
import com.realestate.model.Type;

/**
 * Created by omererkan on 4/6/17.
 */
public interface BannerService {

    public void addCountry(Country country);

    public void addStatus(Status status);

    public void addTypes(Type type);

}

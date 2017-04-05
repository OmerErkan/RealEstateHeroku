package com.realestate.service;

import com.realestate.model.BannerAd;
import com.realestate.model.CorpUser;
import com.realestate.model.User;

/**
 * Created by omererkan on 3/24/17.
 */
public interface UserService {

    public User findByUsername(String username);
    public CorpUser findByCorpUsername(String username);

    public void save(User user);
    public void save(CorpUser user);
    public void addBanner(BannerAd bannerAd);
}

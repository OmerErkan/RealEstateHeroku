package com.realestate.service;

import com.realestate.model.BannerAd;
import com.realestate.model.CorpUser;
import com.realestate.model.User;
import com.realestate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by omererkan on 3/24/17.
 */
@Service
public class UserServiceImpl implements UserService {

    private static List<User> users;
    private static List<CorpUser> corpUsers;
    private static List<BannerAd> bannerAds;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {

        return userRepository.findByUsername(username);
    }

    @Override
    public CorpUser findByCorpUsername(String username) {

        return userRepository.findByCorpUsername(username);
    }

    @Override
    public void save(User user) {

        userRepository.save(user);

    }

    @Override
    public void save(CorpUser user) {

        userRepository.save(user);

    }

    @Override
    public void addBanner(BannerAd bannerAd) {
        bannerAds.add(bannerAd);
    }
}

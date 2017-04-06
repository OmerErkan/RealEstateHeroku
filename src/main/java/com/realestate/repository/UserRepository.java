package com.realestate.repository;

import com.realestate.model.CorpUser;
import com.realestate.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omererkan on 3/24/17.
 */

@Service
public class UserRepository {

    private List<User> users = new ArrayList<>();
    private List<CorpUser> corpUsers  = new ArrayList<>();

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {

            } else {
                return null; //Error handeling class will handle with proper response
            }

        }

        return null;
    }


    public CorpUser findByCorpUsername(String username) {

        for (CorpUser user : corpUsers) {
            if (user.getUsername().equals(username)) {

            } else {
                return null; //Error handeling class will handle with proper response
            }

        }

        return null;
    }


    public void save(User user) {

        if (user != null) {
            users.add(user);
        }

    }

    public void save(CorpUser user) {

        if (user != null) {
            corpUsers.add(user);
        }

    }
}

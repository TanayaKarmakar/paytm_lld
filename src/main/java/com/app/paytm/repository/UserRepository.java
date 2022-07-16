package com.app.paytm.repository;

import com.app.paytm.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public User save(User user) {
        users.add(user);
        System.out.println("User saved");
        return user;
    }
}

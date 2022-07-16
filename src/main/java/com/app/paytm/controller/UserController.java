package com.app.paytm.controller;

import com.app.paytm.models.User;
import com.app.paytm.services.UserService;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User registerUser(String phoneNumber, String password) {
        return userService.registerUser(phoneNumber, password);
    }
}

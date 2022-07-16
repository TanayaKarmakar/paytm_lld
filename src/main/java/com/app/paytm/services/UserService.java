package com.app.paytm.services;

import com.app.paytm.models.User;
import com.app.paytm.repository.UserRepository;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String phoneNumber, String password) {
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setHashsedPassword(password);
        userRepository.save(user);
        return user;
    }
}

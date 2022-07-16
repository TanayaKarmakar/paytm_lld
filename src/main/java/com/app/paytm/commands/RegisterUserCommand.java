package com.app.paytm.commands;

import com.app.paytm.controller.UserController;
import com.app.paytm.repository.UserRepository;
import com.app.paytm.services.UserService;
import com.app.paytm.util.constants.CommandKeyWords;

import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class RegisterUserCommand implements Command{
    private UserController userController;

    public RegisterUserCommand() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        userController = new UserController(userService);
    }

    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split("\\s+"));
        return input.get(0).equals(CommandKeyWords.REGISTER_USER);
    }

    @Override
    public void execute(String command) {
        System.out.println("In Register User Command");
        List<String> input = List.of(command.split("\\s+"));
        userController.registerUser(input.get(1), input.get(2));
    }
}

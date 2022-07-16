package com.app.paytm.commands;

import com.app.paytm.util.constants.CommandKeyWords;

import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class RegisterUserCommand implements Command{
    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split("\\s+"));
        return input.get(0).equals(CommandKeyWords.REGISTER_USER);
    }

    @Override
    public void execute(String command) {

    }
}

package com.app.paytm.commands;

import com.app.paytm.util.constants.CommandKeyWords;

import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class UpdateUserCommand implements Command{
    @Override
    public boolean canExecute(String command) {
        List<String> inputs = List.of(command.split("\\s+"));
        return inputs.get(0).equals(CommandKeyWords.UPDATE_USER);
    }

    @Override
    public void execute(String command) {
        System.out.println("In Update User Command");
    }
}

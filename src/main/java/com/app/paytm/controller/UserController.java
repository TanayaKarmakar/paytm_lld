package com.app.paytm.controller;


import com.app.paytm.commands.RegisterUserCommand;
import com.app.paytm.commands.UpdateUserCommand;
import com.app.paytm.commands.registry.CommandRegistry;
import com.app.paytm.exception.InvalidCommandException;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class UserController {
    public static void main(String[] args) {
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.registerCommand(new RegisterUserCommand());
        commandRegistry.registerCommand(new UpdateUserCommand());

        while(true) {
            String input = "";
            try {
                commandRegistry.executeCommand(input);
            } catch (InvalidCommandException exception) {
                System.out.println("The Command you executed is invalid");
            }
        }
    }
}

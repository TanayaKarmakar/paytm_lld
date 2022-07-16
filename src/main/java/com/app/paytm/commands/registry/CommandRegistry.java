package com.app.paytm.commands.registry;

import com.app.paytm.commands.Command;
import com.app.paytm.exception.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class CommandRegistry {
    private List<Command> commands = new ArrayList<>();

    public void registerCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand(String command) {
        for(Command currentCommand: commands) {
            if(currentCommand.canExecute(command)) {
                currentCommand.execute(command);
                return;
            }
        }
        throw new InvalidCommandException("Invalid Command");
    }
}

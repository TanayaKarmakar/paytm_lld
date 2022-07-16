package com.app.paytm.commands;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public interface Command {
    boolean canExecute(String command);

    void execute(String command);
}

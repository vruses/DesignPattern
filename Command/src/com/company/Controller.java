package com.company;

import com.company.command.Command;

/**
 * Created by huang on 2023/3/29.
 */
public class Controller {
    private final Command[] openCommands = new Command[5];
    private final Command[] closeCommands = new Command[5];

    public void setCommand(int id, Command openCommand, Command closeCommand) {
        openCommands[id - 1] = openCommand;
        closeCommands[id - 1] = closeCommand;
    }

    public void open(int id) {
        Command openCommand = openCommands[id - 1];
        if (openCommand == null) {
            System.out.println("开关 " + id + " 未绑定房间！");
            return;
        }
        openCommand.execute();
    }

    public void close(int id) {
        Command closeCommand = closeCommands[id - 1];
        if (closeCommand == null) {
            System.out.println("开关 " + id + " 未绑定房间！");
            return;
        }
        closeCommand.execute();
    }
}
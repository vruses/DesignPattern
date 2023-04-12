package com.company.command;

import com.company.Room;

/**
 * Created by huang on 2023/3/29.
 */
public abstract class Command {
    protected Room room;
    public abstract void execute();
}

package com.company.command;

import com.company.Room;

/**
 * Created by huang on 2023/3/29.
 */
public class CloseCommand extends Command{
    public CloseCommand(Room room) {
        this.room = room;
    }
    @Override
    public void execute() {
        room.closeLamp();
    }
}
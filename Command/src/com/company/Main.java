package com.company;

import com.company.command.CloseCommand;
import com.company.command.OpenCommand;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        for (int i = 1; i <= 5; i++) {
            String roomName = "房间" + i;
            controller.setCommand(i, new OpenCommand(new Room(roomName)),
                    new CloseCommand(new Room(roomName)));
        }
        controller.open(1);
        controller.open(2);
        controller.close(1);
        controller.close(2);
    }
}

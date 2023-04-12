package com.company;

/**
 * Created by huang on 2023/3/29.
 */
public class Room {
    private final String name;

    public Room(String name) {
        this.name = name;
    }
    public void openLamp(){
        System.out.println(name+"开灯");
    }
    public void closeLamp(){
        System.out.println(name+"关灯");
    }
}

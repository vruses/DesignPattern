package com.company;

public class Client {

    public static void main(String[] args) {
        Member user1 = new Member("张三");
        Member user2 = new Member("李四");
        user1.shareTo(user2);
        Group group = new Group("Twitter Group");
        group.addMember(user1);
        group.addMember(user2);
        Member user3 = new Member("王五");
        user3.shareTo(group);
        group.shareTo(user3);
    }
}

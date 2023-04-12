package com.company;

import com.company.builder.AbstractBuilder;
import com.company.utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        AbstractBuilder builder=null;

        try {
            builder = (AbstractBuilder) XMLUtil.getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (builder == null) {
            System.out.println("未获取到对象");
        } else {
            Director director= new Director(builder);
            Car car=director.construct();
            System.out.println(car.getBody());
            System.out.println(car.getEngine());
            System.out.println(car.getTire());
            System.out.println(car.getGearbox());
        }
    }
}
package com.company;

import com.company.builder.AbstractBuilder;

/**
 * Created by huang on 2023/3/19.
 */
public class Director {
    private final AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }
    public Car construct(){
        builder.buildBody();
        builder.buildEngine();
        builder.buildTire();
        builder.buildGearbox();
        return  builder.getResult();
    }
}

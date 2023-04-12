package com.company.builder;

import com.company.Car;

/**
 * Created by huang on 2023/3/19.
 */
public abstract class AbstractBuilder {
    protected Car car = new Car();
    public abstract void buildBody();
    public abstract void buildEngine();
    public abstract void buildTire();
    public abstract void buildGearbox();
    public Car getResult() {
        return car;
    }
}

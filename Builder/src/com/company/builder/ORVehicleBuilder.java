package com.company.builder;

/**
 * Created by huang on 2023/3/19.
 */
public class ORVehicleBuilder extends AbstractBuilder {
    @Override
    public void buildBody() {
        car.setBody("ORV body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("ORV engine");
    }

    @Override
    public void buildTire() {
        car.setTire("ORV tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("ORV Gearbox");
    }
}

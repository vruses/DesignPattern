package com.company.builder;

/**
 * Created by huang on 2023/3/19.
 */
public class SportsVanBuilder extends AbstractBuilder{
    @Override
    public void buildBody() {
        car.setBody("SportsVan body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("SportsVan engine");
    }

    @Override
    public void buildTire() {
        car.setTire("SportsVan tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("SportsVan Gearbox");
    }
}

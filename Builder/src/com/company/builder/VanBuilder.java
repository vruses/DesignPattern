package com.company.builder;

/**
 * Created by huang on 2023/3/19.
 */
public class VanBuilder extends AbstractBuilder{
    @Override
    public void buildBody() {
        car.setBody("Van body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Van engine");
    }

    @Override
    public void buildTire() {
        car.setTire("Van tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("Van Gearbox");
    }
}

package com.company.builder;

import com.company.Car;

/**
 * Created by huang on 2023/3/19.
 */
public class FormulaCarBuilder extends AbstractBuilder{
    @Override
    public void buildBody() {
        car.setBody("FC body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("FC engine");
    }

    @Override
    public void buildTire() {
        car.setTire("FC tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("FC Gearbox");
    }
}

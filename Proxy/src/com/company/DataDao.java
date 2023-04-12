package com.company;

/**
 * Created by huang on 2023/3/29.
 */
public class DataDao implements DataSupplier{
    @Override
    public String getData(String name) {
        return "Data of "+name;
    }
}

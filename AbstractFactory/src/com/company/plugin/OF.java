package com.company.plugin;

/**
 * Created by huang on 2023/3/19.
 */
public class OF implements DBF{
    @Override
    public C getC() {
        return new OC();
    }

    @Override
    public S getS() {
        return new OS();
    }
}

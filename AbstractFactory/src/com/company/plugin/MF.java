package com.company.plugin;

/**
 * Created by huang on 2023/3/19.
 */
public class MF implements DBF{
    @Override
    public C getC() {
        return new MC();
    }

    @Override
    public S getS() {
        return new MS();
    }
}

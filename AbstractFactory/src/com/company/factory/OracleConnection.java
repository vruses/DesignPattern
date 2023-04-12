package com.company.factory;

/**
 * Created by huang on 2023/3/15.
 */
public class OracleConnection extends Connection{
    @Override
    public void connect() {
        System.out.println("This is OracleConnection");
    }
}

package com.company.factory;

/**
 * Created by huang on 2023/3/15.
 */
public abstract class DBFactory {
    public abstract Connection getConnect();
    public abstract Statement getStatement();
}

package com.company.factory;

/**
 * Created by huang on 2023/3/15.
 */
public class OracleFactory extends DBFactory{
    @Override
    public Connection getConnect() {
        return new OracleConnection();
    }

    @Override
    public Statement getStatement() {
        return new OracleStatement();
    }
}

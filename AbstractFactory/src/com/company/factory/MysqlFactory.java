package com.company.factory;

/**
 * Created by huang on 2023/3/15.
 */
public class MysqlFactory extends DBFactory{

    @Override
    public Connection getConnect() {
        return new MysqlConnection();
    }

    @Override
    public Statement getStatement() {
        return new MysqlStatement();
    }
}

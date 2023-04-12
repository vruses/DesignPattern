package com.company;

/**
 * Created by huang on 2023/3/22.
 */
public abstract class DataOperation {
    private String password;

    public void setPassword(String password) {
        this.password=password;
    }

    public String getPassword() {
        return password;
    }
    public abstract String doEncrypt(int key,String ps);
}

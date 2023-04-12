package com.company;

import com.company.utils.XMLUtil;

public class Client {
    public static void main(String[] args) throws Exception {
        DataOperation dao=(DataOperation) XMLUtil.getBean();
        dao.setPassword("Selenium");
        String ps=dao.getPassword();
        String es=dao.doEncrypt(6,ps);
        System.out.println("明文为："+ps);
        System.out.println("密文为："+es);

    }
}
package com.company;

import com.company.factory.Connection;
import com.company.factory.DBFactory;
import com.company.factory.Statement;
import com.company.utils.XMLUtil;

public class Client {

    public static void main(String[] args) {
        // write your code here
        DBFactory daFactory = null;
        Connection connection;
        Statement statement;

        try {
            daFactory = (DBFactory) XMLUtil.getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (daFactory == null) {
            System.out.println("未获取到对象");
        } else {
            connection = daFactory.getConnect();
            statement = daFactory.getStatement();
            connection.connect();
            statement.statement();
        }
    }
}

/*package com.company;

import com.company.plugin.DBF;
import com.company.plugin.C;
import com.company.plugin.S;
import com.company.utils.XMLUtil;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DBF daFactory = null;
        C connection;
        S statement;

        try {
            daFactory = (DBF) XMLUtil.getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (daFactory == null) {
            System.out.println("未获取到对象");
        } else {
            connection = daFactory.getC();
            statement = daFactory.getS();
            connection.c();
            statement.s();
        }
    }
}*/

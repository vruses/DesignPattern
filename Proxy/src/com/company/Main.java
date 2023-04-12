package com.company;

import com.company.utils.XMLUtil;

public class Main {

    public static void main(String[] args) throws Exception {
        DataSupplier ds=(DataSupplier) XMLUtil.getBean();
        System.out.println(ds.getData("name"));
        System.out.println(ds.getData("count"));
        System.out.println(ds.getData("count"));
    }
}

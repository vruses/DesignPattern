package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2023/3/29.
 */
public class DataDaoProxy implements DataSupplier{
    private final DataDao dataDao=new DataDao();
    private final Map<String,String> caches=new HashMap<>();
    @Override
    public String getData(String name) {
        String data=caches.get(name);
        if (data ==null) {
            data=dataDao.getData(name);
            caches.put(name,data);
            System.out.println("存入缓存：（"+name+"，"+data+"）");
        }
        return data;
    }
}

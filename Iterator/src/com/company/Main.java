package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractDataList dataList = new DataList();
        List<String> data = dataList.getData();
        data.addAll(Arrays.asList("1", "2", "3", "4", "5"));
        AbstractDataIterator iterator = dataList.getIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

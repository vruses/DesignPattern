package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2023/3/29.
 */
public class DataIterator implements AbstractDataIterator {
    private final DataList dataList;
    private final int countPerPage;
    private int cursor;

    public DataIterator(DataList dataList, int countPerPage) {
        this.dataList = dataList;
        this.countPerPage = countPerPage;
    }

    @Override
    public List<String> next() {
        List<String> result = new ArrayList<>(countPerPage);
        List<String> data = dataList.getData();
        for (int i = 0; i < countPerPage; i++) {
            if (cursor < data.size()) {
                result.add(data.get(cursor));
                cursor++;
            }
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return cursor < dataList.getData().size();
    }
}
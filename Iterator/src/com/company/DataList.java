package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2023/3/29.
 */
public class DataList implements AbstractDataList {
    private final List<String> data = new ArrayList<>();

    @Override
    public List<String> getData() {
        return data;
    }

    @Override
    public DataIterator getIterator(int countPerPage) {
        return new DataIterator(this, countPerPage);
    }
}

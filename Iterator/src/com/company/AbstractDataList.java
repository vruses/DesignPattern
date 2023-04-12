package com.company;

import java.util.List;

/**
 * Created by huang on 2023/3/29.
 */
public interface AbstractDataList {
    List<String> getData();

    AbstractDataIterator getIterator(int countPerPage);
}

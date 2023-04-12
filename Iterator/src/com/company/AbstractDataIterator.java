package com.company;

import java.util.List;

/**
 * Created by huang on 2023/3/29.
 */
public interface AbstractDataIterator {
    List<String> next();

    boolean hasNext();
}

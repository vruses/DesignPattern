package com.company.adaptor;

import com.company.DataOperation;
import com.company.adaptee.Caesar;

/**
 * Created by huang on 2023/3/22.
 */
public class CipherAdaptor extends Caesar implements DataOperation{
    @Override
    public String doEncrypt(int key, String ps) {
        return super.doEncrypt(key,ps);
    }
}

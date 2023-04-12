package com.company.adaptor;

import com.company.DataOperation;
import com.company.adaptee.Caesar;

/**
 * Created by huang on 2023/3/22.
 */
public class CipherAdaptor extends DataOperation {
    private Caesar cipher;

    public CipherAdaptor() {
        cipher = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}

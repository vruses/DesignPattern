package com.company.adaptor;

import com.company.DataOperation;
import com.company.adaptee.NewCipher;

/**
 * Created by huang on 2023/3/22.
 */
public class NewCipherAdaptor extends NewCipher implements DataOperation {
    @Override
    public String doEncrypt(int key, String ps) {
        return super.doEncrypt(key,ps);
    }
}

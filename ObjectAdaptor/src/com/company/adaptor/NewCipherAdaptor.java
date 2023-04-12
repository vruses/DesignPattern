package com.company.adaptor;

import com.company.DataOperation;
import com.company.adaptee.NewCipher;

/**
 * Created by huang on 2023/3/22.
 */
public class NewCipherAdaptor extends DataOperation {
    private NewCipher cipher;
    public NewCipherAdaptor(){
        cipher=new NewCipher();
    }
    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key,ps);
    }
}

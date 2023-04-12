package com.company.adaptee;

/**
 * Created by huang on 2023/3/22.
 */
public class Caesar {
    public String doEncrypt(int key,String ps){
        StringBuilder es= new StringBuilder();
        for(int i=0;i<ps.length();i++){
            char c=ps.charAt(i);
            if(c>='a'&&c<='z'){
                c+=key%26;
                if(c>'z')c-=26;
                if(c<'a')c+=26;
            }
            if(c>='A'&&c<='Z'){
                c+=key%26;
                if(c>'Z')c-=26;
                if(c<'A')c+=26;
            }
            es.append(c);
        }
        return es.toString();
    }
}

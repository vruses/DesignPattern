package com.company;

/**
 * Created by huang on 2023/3/27.
 */
public class FormDecoratorA extends FormDecorator{
    public static final String head="FormDecoratorA add Head";
    public static final String tail="FormDecoratorA add Tail";
    public String getContent(){
        return head+"\n"+super.getContent()+"\n"+tail;
    }

}

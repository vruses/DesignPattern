package com.company;

/**
 * Created by huang on 2023/3/27.
 */
public class FormDecoratorB extends FormDecorator{
    public static final String head="FormDecoratorB add Head";
    public static final String tail="FormDecoratorB add Tail";
    public String getContent(){
        return head+"\n"+super.getContent()+"\n"+tail;
    }
}

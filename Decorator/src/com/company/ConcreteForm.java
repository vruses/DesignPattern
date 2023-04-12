package com.company;

/**
 * Created by huang on 2023/3/27.
 */
public class ConcreteForm implements Form{
    private String content;
    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content=content;
    }
}

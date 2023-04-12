package com.company;

/**
 * Created by huang on 2023/3/27.
 */
public class FormDecorator implements Form{
    private Form form;



    public void setForm(Form form) {
        this.form = form;
    }

    @Override
    public String getContent() {
        return form.getContent();
    }

    @Override
    public void setContent(String content) {
        form.setContent(content);
    }
}

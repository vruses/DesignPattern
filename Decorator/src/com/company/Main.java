package com.company;


import com.company.utils.XMLUtil;


public class Main {
    public static void main(String[] args) throws Exception {
        ConcreteForm form = new ConcreteForm();
        form.setContent("报表内容……");
        FormDecorator formDecorator=(FormDecorator) XMLUtil.getBean();
        formDecorator.setForm(form);
        System.out.println(formDecorator.getContent());

    }
}

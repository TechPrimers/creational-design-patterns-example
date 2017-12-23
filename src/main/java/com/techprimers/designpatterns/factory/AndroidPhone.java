package com.techprimers.designpatterns.factory;

public class AndroidPhone extends Phone {

    protected void createPhone() {
        specifications.add(new AndroidCamera());
        specifications.add(new AndroidPanel());
        specifications.add(new AndroiProcessor());
    }
}

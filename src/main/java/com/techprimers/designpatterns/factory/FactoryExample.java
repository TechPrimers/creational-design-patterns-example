package com.techprimers.designpatterns.factory;

public class FactoryExample {


    public static void main(String[] args) {


        Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);
        Phone iphone2 = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android);
        System.out.println(iphone);
        System.out.println(iphone2);

        /*
        1. Calendar
        2. NumberFormat
         */
    }
}

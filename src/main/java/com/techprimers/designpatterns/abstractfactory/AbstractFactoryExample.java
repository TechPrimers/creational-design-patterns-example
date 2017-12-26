package com.techprimers.designpatterns.abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {


        OSFactory factory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
        Phone pixelPhone = factory.create(ManufacturerType.GOOGLE);
        pixelPhone.display();

        OSFactory wfactory = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
        Phone nokiaPhone = wfactory.create(ManufacturerType.MICROSOFT);
        nokiaPhone.display();

        /**
         * DocumentBuilderFactory
         */

    }
}

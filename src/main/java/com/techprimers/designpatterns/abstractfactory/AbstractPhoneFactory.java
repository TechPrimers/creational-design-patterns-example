package com.techprimers.designpatterns.abstractfactory;

public abstract class AbstractPhoneFactory {

    //WindowsFactory
    //AndroidFactory
    //OSFactory


    public static OSFactory getFactory(OSType osType) {

        switch (osType) {
            case ANDROID:
                return new AndroidFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}

package com.techprimers.designpatterns.abstractfactory;

import com.techprimers.designpatterns.factory.PhoneType;

public interface OSFactory {

    Phone create(ManufacturerType manufacturerType);
}

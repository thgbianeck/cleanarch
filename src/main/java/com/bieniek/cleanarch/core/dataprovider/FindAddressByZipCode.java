package com.bieniek.cleanarch.core.dataprovider;

import com.bieniek.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(String zipCode);
}

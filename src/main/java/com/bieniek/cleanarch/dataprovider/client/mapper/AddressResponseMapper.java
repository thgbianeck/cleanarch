package com.bieniek.cleanarch.dataprovider.client.mapper;

import com.bieniek.cleanarch.core.domain.Address;
import com.bieniek.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

    AddressResponse toAddressResponse(Address address);
}

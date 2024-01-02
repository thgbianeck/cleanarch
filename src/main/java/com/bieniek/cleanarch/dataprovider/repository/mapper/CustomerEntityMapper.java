package com.bieniek.cleanarch.dataprovider.repository.mapper;

import com.bieniek.cleanarch.core.domain.Address;
import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.dataprovider.client.response.AddressResponse;
import com.bieniek.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    Customer toCustomer(CustomerEntity customerEntity);

    CustomerEntity toCustomerEntity(Customer customer);
}

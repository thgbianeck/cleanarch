package com.bieniek.cleanarch.entrypoint.controller.mapper;

import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.bieniek.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerRequest toCustomerRequest(Customer customer);
}

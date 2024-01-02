package com.bieniek.cleanarch.core.usecase.impl;

import com.bieniek.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.bieniek.cleanarch.core.dataprovider.UpdateCustomer;
import com.bieniek.cleanarch.core.domain.Address;
import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bieniek.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }
    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.id());
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}

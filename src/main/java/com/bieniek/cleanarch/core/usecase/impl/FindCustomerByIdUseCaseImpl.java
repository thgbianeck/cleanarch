package com.bieniek.cleanarch.core.usecase.impl;

import com.bieniek.cleanarch.core.dataprovider.FindCustomerById;
import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer " + id + " not found"));
    }
}

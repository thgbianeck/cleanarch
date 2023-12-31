package com.bieniek.cleanarch.core.usecase;

import com.bieniek.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}

package com.bieniek.cleanarch.core.usecase;

import com.bieniek.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}

package com.bieniek.cleanarch.core.usecase;

import com.bieniek.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}

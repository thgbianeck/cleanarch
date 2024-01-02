package com.bieniek.cleanarch.core.dataprovider;

import com.bieniek.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}

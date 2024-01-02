package com.bieniek.cleanarch.dataprovider;

import com.bieniek.cleanarch.core.dataprovider.InsertCustomer;
import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.dataprovider.repository.CustomerRepository;
import com.bieniek.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper mapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = mapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}

package com.bieniek.cleanarch.dataprovider;

import com.bieniek.cleanarch.core.dataprovider.FindCustomerById;
import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.dataprovider.repository.CustomerRepository;
import com.bieniek.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper mapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(mapper::toCustomer);
    }
}

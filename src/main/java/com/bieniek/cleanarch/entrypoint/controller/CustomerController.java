package com.bieniek.cleanarch.entrypoint.controller;

import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.core.usecase.InsertCustomerUseCase;
import com.bieniek.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.bieniek.cleanarch.entrypoint.controller.request.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        Customer customer = customerMapper.toCustomer(request);
        insertCustomerUseCase.insert(customer, request.getZipCode());

        return ResponseEntity.ok().build();
    }
}

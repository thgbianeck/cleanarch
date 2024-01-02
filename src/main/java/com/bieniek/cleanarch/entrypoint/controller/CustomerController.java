package com.bieniek.cleanarch.entrypoint.controller;

import com.bieniek.cleanarch.core.domain.Customer;
import com.bieniek.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bieniek.cleanarch.core.usecase.InsertCustomerUseCase;
import com.bieniek.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.bieniek.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.bieniek.cleanarch.entrypoint.controller.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerMapper customerMapper;
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        Customer customer = customerMapper.toCustomer(request);
        insertCustomerUseCase.insert(customer, request.getZipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
        Customer customer = findCustomerByIdUseCase.find(id);
        CustomerResponse response = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(response);
    }
}

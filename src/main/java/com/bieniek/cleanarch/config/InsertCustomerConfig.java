package com.bieniek.cleanarch.config;

import com.bieniek.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.bieniek.cleanarch.core.dataprovider.InsertCustomer;
import com.bieniek.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}

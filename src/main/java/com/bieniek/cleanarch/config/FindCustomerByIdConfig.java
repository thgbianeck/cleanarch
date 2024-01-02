package com.bieniek.cleanarch.config;

import com.bieniek.cleanarch.core.dataprovider.FindCustomerById;
import com.bieniek.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCaseImpl(
            FindCustomerById findCustomerById) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}

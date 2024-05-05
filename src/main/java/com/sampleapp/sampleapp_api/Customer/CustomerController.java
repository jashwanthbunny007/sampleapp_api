package com.sampleapp.sampleapp_api.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMERS= List.of(
            new Customer(1L,"Meghana","acharya","achar23@gmail.com"),
            new Customer(2L,"kavya","reddy","kvr13@gmail.com"),
            new Customer(3L,"praneeeth","reddu","gpranee23@gmail.com")
    );

    @GetMapping
    public static List<Customer> findallCUSTOMERS() {
        return CUSTOMERS;
    }
}

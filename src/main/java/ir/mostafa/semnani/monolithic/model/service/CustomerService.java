package ir.mostafa.semnani.monolithic.model.service;

import ir.mostafa.semnani.monolithic.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer save(Customer customer);
}

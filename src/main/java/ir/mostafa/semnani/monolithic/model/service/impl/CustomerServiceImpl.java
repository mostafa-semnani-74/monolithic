package ir.mostafa.semnani.monolithic.model.service.impl;

import ir.mostafa.semnani.monolithic.model.entity.Customer;
import ir.mostafa.semnani.monolithic.model.repository.CustomerRepository;
import ir.mostafa.semnani.monolithic.model.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}

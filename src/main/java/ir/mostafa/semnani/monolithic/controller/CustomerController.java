package ir.mostafa.semnani.monolithic.controller;

import ir.mostafa.semnani.monolithic.model.entity.Customer;
import ir.mostafa.semnani.monolithic.model.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}

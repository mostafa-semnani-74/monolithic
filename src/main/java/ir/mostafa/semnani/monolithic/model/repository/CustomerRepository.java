package ir.mostafa.semnani.monolithic.model.repository;

import ir.mostafa.semnani.monolithic.model.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}

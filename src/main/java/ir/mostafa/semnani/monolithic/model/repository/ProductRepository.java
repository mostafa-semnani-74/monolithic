package ir.mostafa.semnani.monolithic.model.repository;

import ir.mostafa.semnani.monolithic.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

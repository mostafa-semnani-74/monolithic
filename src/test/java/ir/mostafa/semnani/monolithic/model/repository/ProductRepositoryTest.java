package ir.mostafa.semnani.monolithic.model.repository;

import ir.mostafa.semnani.monolithic.model.entity.Product;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    @Order(1)
    public void saveProduct() {
        Product product = Product.builder()
                .name("supra")
                .build();

        System.out.println(productRepository.save(product));
    }

    @Test
    @Order(2)
    public void findAll() {
        productRepository.findAll().forEach(p -> System.out.println(p.toString()));
    }


}

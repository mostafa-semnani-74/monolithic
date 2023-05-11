package ir.mostafa.semnani.monolithic.model.service;

import ir.mostafa.semnani.monolithic.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAll();

    void create(ProductDTO productDTO);
}

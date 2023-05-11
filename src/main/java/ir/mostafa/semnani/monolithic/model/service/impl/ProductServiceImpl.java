package ir.mostafa.semnani.monolithic.model.service.impl;

import ir.mostafa.semnani.monolithic.model.dto.ProductDTO;
import ir.mostafa.semnani.monolithic.model.mapper.ProductMapper;
import ir.mostafa.semnani.monolithic.model.repository.ProductRepository;
import ir.mostafa.semnani.monolithic.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll() {
        return ProductMapper.toDTOs(productRepository.findAll());
    }

    @Override
    public void create(ProductDTO productDTO) {
        productRepository.save(ProductMapper.toEntity(productDTO));
    }
}

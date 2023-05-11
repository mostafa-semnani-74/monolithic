package ir.mostafa.semnani.monolithic.model.mapper;

import ir.mostafa.semnani.monolithic.model.dto.ProductDTO;
import ir.mostafa.semnani.monolithic.model.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {
    public static Product toEntity(ProductDTO dto) {
        return Product.builder()
                .name(dto.getName())
                .build();
    }

    public static ProductDTO toDTO(Product entity) {
        return ProductDTO.builder()
                .name(entity.getName())
                .build();
    }

    public static List<ProductDTO> toDTOs(List<Product> products) {
        return products.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }
}

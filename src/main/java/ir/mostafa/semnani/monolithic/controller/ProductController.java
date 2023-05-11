package ir.mostafa.semnani.monolithic.controller;

import ir.mostafa.semnani.monolithic.model.dto.ProductDTO;
import ir.mostafa.semnani.monolithic.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDTO>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO) {
        productService.create(productDTO);
        return ResponseEntity.ok(productDTO);
    }
}

package com.example.shop.product;


// import com.example.shop.product.dto.ProductCreateRequest;
// import com.example.shop.product.dto.ProductUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody ProductCreateRequest request) {
        Long productID = productService.createProduct(request);
        return ResponseEntity.created(URI.create("/products/" + productID)).build();
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        // Service 계층에서 회원 목록을 가져온다
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{productID}")
    public ResponseEntity<Product> getProduct(@PathVariable Long productID) {
        Product product = productService.getProductByID(productID);
        return ResponseEntity.ok(product);
    }

    @PatchMapping("/{productID}")
    public ResponseEntity<Void> updateProduct(@PathVariable Long productID, @RequestBody ProductUpdateRequest request) {
        productService.updateProduct(productID, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{productID}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productID) {
        productService.deleteProduct(productID);
        return ResponseEntity.noContent().build(); // 204 no content
    }



}









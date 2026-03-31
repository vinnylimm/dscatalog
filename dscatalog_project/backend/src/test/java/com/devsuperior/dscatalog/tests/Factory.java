package com.devsuperior.dscatalog.tests;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import java.time.Instant;

public class Factory {

    public static Product createProduct(){
        Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
        Category cat = new Category("Eletronics");
        cat.setId(2L);

        product.getCategories().add(cat);
        return product;
    }

    public static ProductDTO crateProductDTO(){
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }

}

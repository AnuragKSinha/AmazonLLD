package io.anuragksinha.service;

import io.anuragksinha.enums.ProductCategory;
import io.anuragksinha.pojo.Product;

import java.util.List;

public interface SearchService {
    List<Product> searchByName(String name);
    List<Product> searchByProductCategory(ProductCategory productCategory);
}

package io.anuragksinha.service;

import io.anuragksinha.enums.ProductCategory;
import io.anuragksinha.pojo.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalog implements SearchService{
    HashMap<String,List<Product>> productByNames;
    HashMap<ProductCategory,List<Product>> productByCategory;

    public List<Product> searchByName(String name) {
        return productByNames.get(name);
    }

    public List<Product> searchByProductCategory(ProductCategory productCategory) {
        return productByCategory.get(productCategory);
    }
}

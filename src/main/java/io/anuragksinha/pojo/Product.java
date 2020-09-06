package io.anuragksinha.pojo;

import io.anuragksinha.enums.ProductCategory;

import java.util.List;

public class Product {
    private String product_id;
    private String description;
    private double price;
    private ProductCategory productCategory;
    private List<ProductReview> productReview;
    private String image_url;


}

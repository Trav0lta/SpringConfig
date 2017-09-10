package ua.com.owu.service;

import ua.com.owu.entity.Product;

import java.util.List;

/**
 * Created by User on 30.08.2017.
 */
public interface ProductService {
    void save(String productName);
    void save(Product product);
    Product findOne(int id);
    List<Product> findAll();
}

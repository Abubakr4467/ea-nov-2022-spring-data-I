package edu.miu.springDataLab3.service;


import edu.miu.springDataLab3.entity.Product;
import edu.miu.springDataLab3.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    List<Product> findAllByPriceGreaterThan(double price);

}

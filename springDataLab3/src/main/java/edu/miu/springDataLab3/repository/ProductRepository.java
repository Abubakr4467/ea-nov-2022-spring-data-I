package edu.miu.springDataLab3.repository;


import edu.miu.springDataLab3.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {


    //Find all products that cost more than minPrice.

    //Find all products in cat category and cost less than maxPrice

    List<Product> findAllByPriceGreaterThan(double price);

    List<Product> findAllByPriceLessThan(double price);

}

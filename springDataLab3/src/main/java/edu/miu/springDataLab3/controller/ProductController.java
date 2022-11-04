package edu.miu.springDataLab3.controller;

import edu.miu.springDataLab3.entity.Product;
import edu.miu.springDataLab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;



//    Find all products that cost more than minPrice.
    @GetMapping("/{price}")
    public void findAllByPriceGreaterThan(@PathVariable double price){
        productService.findAllByPriceGreaterThan(price);
    }

}

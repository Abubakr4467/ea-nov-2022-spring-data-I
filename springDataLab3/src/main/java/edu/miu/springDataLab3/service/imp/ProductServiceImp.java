package edu.miu.springDataLab3.service.imp;

import edu.miu.springDataLab3.entity.Product;
import edu.miu.springDataLab3.repository.ProductRepository;
import edu.miu.springDataLab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp  implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllByPriceGreaterThan(double price) {
        return productRepository.findAllByPriceGreaterThan(price);
    }
}

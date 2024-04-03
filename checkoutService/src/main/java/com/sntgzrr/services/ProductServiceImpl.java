package com.sntgzrr.services;

import com.sntgzrr.models.Product;
import com.sntgzrr.repositories.FeignProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private FeignProductsRepository feignProductsRepository;
    @Override
    public Product getProduct(String id) {
        return feignProductsRepository.getProductByID(id);
    }
}

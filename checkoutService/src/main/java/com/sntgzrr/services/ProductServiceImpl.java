package com.sntgzrr.services;

import com.sntgzrr.models.Product;
import com.sntgzrr.repositories.FeignProductsRepository;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private FeignProductsRepository feignProductsRepository;

    Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Override
    @CircuitBreaker(name = "product", fallbackMethod = "getProductFallbackMethod")
    @Retry(name = "product")
    public Product getProduct(String id) {
        logger.info("Intentando obtener el producto con ID: "+id);
        return feignProductsRepository.getProductByID(id, true);
    }

    public Product getProductFallbackMethod(String id, CallNotPermittedException exception){
        logger.error("Circuit breaker en estado Open");
        return new Product();
    }
}

package com.sntgzrr.repositories;

import com.sntgzrr.config.LoadBalancerConfig;
import com.sntgzrr.models.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "productService")
//@LoadBalancerClient(value = "productService", configuration = LoadBalancerConfig.class)
public interface FeignProductsRepository {
    @RequestMapping(method = RequestMethod.GET, value = "/products")
    Product getProductByID(@RequestParam String id, @RequestParam Boolean throwError);
}

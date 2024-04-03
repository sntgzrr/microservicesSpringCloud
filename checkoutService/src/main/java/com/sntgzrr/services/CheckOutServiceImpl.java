package com.sntgzrr.services;

import com.sntgzrr.models.Product;
import com.sntgzrr.models.checkOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CheckOutServiceImpl implements ICheckOutService{

    @Autowired
    private IProductService productService;
    @Override
    public checkOut buildCheckOut(List<String> productsIds) {
        Double total = 0.0;
        for (String id : productsIds){
            Product product = productService.getProduct(id);
            System.out.println("Respuesta desde"+ product.getInstance());
            total += product.getPrice();
        }
        checkOut checkOut = new checkOut("234", "wwww.digitalhouse.com", total.toString(), Arrays.asList("Credit", "Debit"));
        return checkOut;
    }
}

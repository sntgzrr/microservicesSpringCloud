package com.sntgzrr.controllers;

import com.sntgzrr.models.checkOut;
import com.sntgzrr.services.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/checkout")
public class checkOutController {
    @Autowired
    private ICheckOutService checkOutService;

    @GetMapping()
    public checkOut getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-from") String requestFrom){
        System.out.println("Enviado desde:"+ requestFrom);
        if (!requestFrom.equals("gateway")){
            return null;
        }
        return checkOutService.buildCheckOut(productIds);
    }
}

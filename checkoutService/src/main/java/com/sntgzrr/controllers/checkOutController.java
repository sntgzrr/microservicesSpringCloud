package com.sntgzrr.controllers;

import com.sntgzrr.models.checkOut;
import com.sntgzrr.services.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/checkout")
public class checkOutController {
    @Autowired
    private ICheckOutService checkOutService;

    @GetMapping()
    public checkOut getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-from") String requestFrom, @RequestHeader() Map<String, String> headers){
        System.out.println("Enviado desde:"+ requestFrom);
        if (!requestFrom.equals("gateway")){
            return null;
        }
        return checkOutService.buildCheckOut(productIds);
    }
    @GetMapping("/{id}")
    public checkOut getByID(@PathVariable String id){
        return new checkOut(id);
    }
}

package com.sntgzrr.controllers;

import com.sntgzrr.models.checkOut;
import com.sntgzrr.services.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/checkout")
public class checkOutController {
    @Autowired
    private ICheckOutService checkOutService;

    @GetMapping()
    public checkOut getCheckout(@RequestParam List<String> productIds){
        return checkOutService.buildCheckOut(productIds);
    }
}

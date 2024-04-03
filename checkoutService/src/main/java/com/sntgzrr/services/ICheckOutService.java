package com.sntgzrr.services;

import com.sntgzrr.models.checkOut;

import java.util.List;

public interface ICheckOutService {
    public checkOut buildCheckOut(List<String> productsIds);
}

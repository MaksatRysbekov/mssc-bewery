package com.example.msscbewery.web.services;

import com.example.msscbewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}

package com.enlar.tarjetas.controllers;

import com.enlar.tarjetas.services.TarjetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TarjetaController {
    @Autowired
    TarjetaService service;
    
}

package com.enlar.tarjetas.controllers;

import com.enlar.tarjetas.models.GenerycResponse;
import com.enlar.tarjetas.services.PagoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController  
public class PagoController {
    @Autowired
    PagoService Service;

    @GetMapping("/pagos")

    public ResponseEntity<List<pago>>aceptarOperacion(){
        return ResponseEntity.ok(Service.aceptarOperacion());
        
    }

    @PostMapping("/pagos")
    public ResponseEntity<?>crearPago(RequestBody Pago pago){
        service.crearPago (pago);
        GenerycResponse respuesta = new GenerycResponse();
        respuesta.isok = true;
        respuesta.id= pago.getPagoId();
        respuesta.message="El pago fue realizado con exito.";
        return ResponseEntity.o(respuesta);
    }
    
}

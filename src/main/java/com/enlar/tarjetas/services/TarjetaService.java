package com.enlar.tarjetas.services;

import java.sql.Date;

import com.enlar.tarjetas.repos.TarjetaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

//creo un service con la funcionalidad de ver si la tarjeta es valida
// y si es distinta a otra.

@Service
public class TarjetaService {

    @Autowired

    TarjetaRepository repository;

    public boolean tarjetaValida(){
        Date fechaVencimiento;
        Date fechaActual;
        //aca da error porque no puede comparar fechas directamente.
        //Capaz haya que comparar entre años, entre meses y entre dias primero.
        if (fechaVencimiento > fechaActual){
        return true;

        }
    }

    public boolean tarjetaDistinta(){
        String numeroTarjeta;
        String numeroTarjetaAComparar;
        if (numeroTarjeta != numeroTarjetaAComparar){
        return true;

        }
    }
    public List<Tarjeta> mostrarInfo(String marca, String numeroTarjeta, String nombreapellido, Date fechavencimiento){
        return repository.findAll();
    }
        
    }
}

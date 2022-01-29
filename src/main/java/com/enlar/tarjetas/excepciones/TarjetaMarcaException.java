package com.enlar.tarjetas.excepciones;

import com.enlar.tarjetas.entities.Tarjeta;

public class TarjetaMarcaException extends Exception {

    private static int mensaje;
    private Tarjeta tarjeta;

    public TarjetaMarcaException() {
        Tarjeta tarjeta;
    }

    public TarjetaMarcaException(Tarjeta tarjeta, String marca){
        super(tarjeta.getMarca() + ":" + mensaje);
        this.tarjeta = tarjeta;
    }
}
    




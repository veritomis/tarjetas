package com.enlar.tarjetas.excepciones;

import com.enlar.tarjetas.entities.Pago;

public class PagoMontoOperacionException extends Exception {

     
    private int pago = 0;
    private int montoOperacion = 0;

    public PagoMontoOperacionException() {
        Pago pago;
    }

    public PagoMontoOperacionException(Pago pago, montoOperacion){
        super(pago.getMontoOperacion() + ":" + mensaje);
        this.pago = pago;
    }
    
}




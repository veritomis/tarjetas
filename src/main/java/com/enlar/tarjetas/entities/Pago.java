package com.enlar.tarjetas.entities;

public class Pago {
    public int id;
    public int montoOperacion;
    public int recargoTarjeta;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMontoOperacion() {
        return montoOperacion;
    }
    public void setMontoOperacion(int montoOperacion) {
        this.montoOperacion = montoOperacion;
    }
    public int getRecargoTarjeta() {
        return recargoTarjeta;
    }
    public void setRecargoTarjeta(int recargoTarjeta) {
        this.recargoTarjeta = recargoTarjeta;
    }

}

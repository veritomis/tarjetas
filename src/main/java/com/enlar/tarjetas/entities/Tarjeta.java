package com.enlar.tarjetas.entities;

import java.sql.Date;

public class Tarjeta {
    private String marca;
	private String numeroTarjeta;
	private String nombreApellido;
	private Date fechaVencimiento;
    public String getMarca() {
        return marca;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getNombreApellido() {
        return nombreApellido;
    }
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}

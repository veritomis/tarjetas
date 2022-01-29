package com.enlar.tarjetas.services;

import com.enlar.tarjetas.repos.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//creo un service con la funcionalidad de ver si la operación 
//es menor a 1000.

@Service
public class PagoService {
    
    @Autowired
    PagoRepository repository;

    
        public boolean aceptarOperacion(){
            Integer montoOperacion;
            if (montoOperacion < 1000){
	        return true;

            }
        }

        Private String marca = "";

        public boolean elegirCalculo(){
            if (marca = "Visa"){
                calculoTasaVisa(anio, mes);
            
            }
            else{
                if(marca= "Nara"){
                    calculoTasaNara(dia, num1);
                }
                else{
                    calculoTasaAmex(mes, num2);
                }

    
            }

        }

        private int anio = 0;
        private int mes= 0;
        private int dia = 0;
        private int num1= 0;
        private int num2= 0;

        public void calculoTasaVisa(int anio, int mes){
            int tasa = anio/mes;
        }
        
        public void calculoTasaNara(int dia, int num1){
            int tasa = dia * num1;
         
        }
        
        public void calculoTasaAmex(int mes, int num2){
            int tasa = mes * num2;
       
        }
}
     

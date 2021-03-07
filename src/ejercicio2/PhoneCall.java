/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author logra
 */
public abstract class PhoneCall {
    
    private String numero;
    private Double tarifa;

    public PhoneCall(String numero) {
        this.numero = numero;
        setTarifa(0.00);
    }

    public String getNumero() {
        return numero;
    }

    public Double getTarifa() {
        return tarifa;
    }
    
    public abstract String getInfoLlamada();

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    
}

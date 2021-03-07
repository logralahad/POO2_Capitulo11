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
public class OutgoingPhoneCall extends PhoneCall {
    
    public static final Double COSTO = 0.04;
    
    private Integer minutos;

    public OutgoingPhoneCall(String numero, Integer minutos) {
        super(numero);
        this.setTarifa(COSTO * minutos);
        this.minutos = minutos;
    }
    
    @Override
    public String getInfoLlamada() {
        return String.format("Numero: %s Tarifa: $%.2f Precio por llamada: $%.2f\n",
                this.getNumero(), COSTO, this.getTarifa());
    }
    
}

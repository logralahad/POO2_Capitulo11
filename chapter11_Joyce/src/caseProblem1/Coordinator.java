/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

/**
 *
 * @author logra
 */
public class Coordinator extends Employee {

    public Coordinator(Integer id, String nombre, String apellido, Integer pago_por_hora) {
        super(id, nombre, apellido);
        this.setPagoPorHora(pago_por_hora);
        this.setPuesto();
    }

    @Override
    public void setPagoPorHora(Integer pago_por_hora) {
        if(pago_por_hora > 10){
            this.pago_por_hora = 20;
        }
        else{
            this.pago_por_hora = pago_por_hora;
        }
    }

    @Override
    public void setPuesto() {
        this.puesto = "coordinador";
    }
    
}

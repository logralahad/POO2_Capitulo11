/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author logra
 */
public abstract class Equipment {
    
    public final String[] EQUIPO = {"jet ski", "barco ponton", "bote de remo", 
        "canoa", "kayak", "silla de playa", "sombrilla", "otro"};
    
    public final Integer[] TARIFAS = {50, 40, 15, 12, 10, 2, 1, 0};

    protected Integer tipo_equipo;
    protected String equipo;
    protected Integer tarifa;

    public Equipment(Integer tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
        this.setEquipo();
        this.setTarifa();
    }

    public Integer getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(Integer tipo_equipo) {
        if(tipo_equipo < 0 && tipo_equipo > 8){
            this.tipo_equipo = 8;
        }
        else{
            this.tipo_equipo = tipo_equipo;
        }
    }

    public String getEquipo() {
        return equipo;
    }

    private void setEquipo() {
        this.equipo = EQUIPO[this.tipo_equipo];
    }

    public Integer getTarifa() {
        return tarifa;
    }

    protected void setTarifa() {
        this.tarifa = TARIFAS[this.tipo_equipo];
    }
    
    public abstract String lessonPolicy();   
    
}

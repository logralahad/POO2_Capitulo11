/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author logra
 */
public abstract class Student {
    
    private String name;
    private Boolean tiempo_completo;

    public Student(String name, Boolean tiempo_completo) {
        this.name = name;
        this.tiempo_completo = tiempo_completo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTiempo_completo() {
        return tiempo_completo;
    }

    public void setTiempo_completo(Boolean tiempo_completo) {
        this.tiempo_completo = tiempo_completo;
    }
    
    public abstract Integer obtenerTarifa();
}

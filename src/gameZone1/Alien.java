/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public abstract class Alien {
    
    protected String nombre;
    protected Integer ojos;
    protected Integer fuerza;
    protected String rol;

    public Alien(String nombre, Integer ojos, Integer fuerza, String rol) {
        this.nombre = nombre;
        this.ojos = ojos;
        this.fuerza = fuerza;
        this.rol = rol;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\nNum. de ojos: %d\nFuerza vital: %d\nRol: %s\n", this.nombre,
                this.ojos, this.fuerza, this.rol);
    }
    
}

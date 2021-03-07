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
public abstract class Employee {
    
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected Integer pago_por_hora;
    protected String puesto;

    public Employee(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getPago_por_hora() {
        return pago_por_hora;
    }

    public abstract void setPagoPorHora(Integer pago_por_hora);

    public String getPuesto() {
        return puesto;
    }

    public abstract void setPuesto();
    
    @Override
    public String toString(){
        return String.format("ID: %d\nNombre completo: %s %s\nPago por hora: $%d\nPuesto: %s", 
                this.id, this.nombre, this.apellido, this.pago_por_hora, this.puesto);
    }
    
}

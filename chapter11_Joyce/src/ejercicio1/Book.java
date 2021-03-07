/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author logra
 */
public abstract class Book {
    private String titulo;
    private Double precio;

    public Book(String titulo) {
        this.titulo = titulo;
        this.precio = setPrecio();
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public abstract Double setPrecio();
    
    public String toString(){
        return String.format("Titulo: %s Precio: $%.2f\n", titulo, precio);
    }
}

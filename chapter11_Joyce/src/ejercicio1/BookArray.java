/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class BookArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Book> libros = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                libros.add(new Fiction(String.format("Libro %d de ficcion ", (i + 1))));
            }
            else{
                libros.add(new NonFiction(String.format("Libro %d de no-ficcion ", (i + 1))));
            }
        }
        
        for (Book libro : libros) {
            System.out.println(libro.toString());
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;//635 pdf

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class StaffDinnerEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<DinnerEvent> eventos = new ArrayList<>();
        
        
        for (int i = 0; i < 2; i++) {
            DinnerEvent e = DinnerEvent.crearEvento(i);
            eventos.add(e);
            e.crearStaff();            
        }
        
        Event.ordenar(eventos);
        
        for (DinnerEvent s : eventos) {
            System.out.println(s.eCosto());
            s.printStaff();
            Event.CarlysMotto();
        }
    }
    
}

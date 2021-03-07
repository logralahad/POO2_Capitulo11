/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class PhoneCallArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PhoneCall> telefonos = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                telefonos.add(new IncomingPhoneCall("65156123"));
            }
            else{
                telefonos.add(new OutgoingPhoneCall("65156156", i + 40));
            }
        }
        
        for (int i = 0; i < telefonos.size(); i++) {
            System.out.println("Telefono " + (i + 1) + "\n" + telefonos.get(i).getInfoLlamada());
        }
    }
    
}

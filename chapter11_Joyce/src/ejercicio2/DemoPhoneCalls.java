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
public class DemoPhoneCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IncomingPhoneCall cel1 = new IncomingPhoneCall("9516452345");
        OutgoingPhoneCall cel2 = new OutgoingPhoneCall("9513045261", 45);
        
        System.out.println("Cel1\n" + cel1.getInfoLlamada());
        System.out.println("Cel2\n" + cel2.getInfoLlamada());
        
    }
    
}

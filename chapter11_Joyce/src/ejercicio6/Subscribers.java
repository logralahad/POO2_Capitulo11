/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public class Subscribers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeekdaySubscriber sub1 = new WeekdaySubscriber("Col. Reforma #707");
        WeekendSubscriber sub2 = new WeekendSubscriber("Col. Aleman #709");
        SevenDaySubscriber sub3 = new SevenDaySubscriber("Col. del Rio #785");
        
        System.out.println(sub1.toString());
        System.out.println(sub2.toString());
        System.out.println(sub3.toString());
        
    }
    
}

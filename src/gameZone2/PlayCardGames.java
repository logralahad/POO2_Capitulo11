/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class PlayCardGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        War juego1 = new War();
        juego1.displayDescription();
        while(juego1.getTam() > 0){
            Card jugador = juego1.deal();
            Card pc = juego1.deal();
            
            jugador.showCard();
            pc.showCard();
            juego1.winWar(jugador, pc);
        }
        System.out.println(juego1.resultados());
        
        
        System.out.print("\n---------------------------------");
        System.out.println("---------------------------------\n");
        
        
        WarDeck juego2 = new WarDeck();
        juego2.displayDescription();
        while(juego2.getTam() > 0){
            
            ArrayList<Card> mano_jugador = new ArrayList<>();
            ArrayList<Card> mano_pc = new ArrayList<>();
            
            for (int i = 0; i < 5; i++) {
                mano_jugador.add(juego2.deal());
                mano_pc.add(juego2.deal());
            }
            
            WarDeck.imprimirMano(mano_jugador, "jugador");
            WarDeck.imprimirMano(mano_jugador, "computadora");
            
            juego2.jugar(mano_jugador, mano_pc);
        }
        System.out.println(juego2.resultados());
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author logra
 */
public abstract class CardGame {
    
    public static final Integer NUM_RONDAS = 4;
    
    private ArrayList<Card> mazo;
    private Integer mano;
    private Integer rondas;

    public CardGame() {
        setMano(darTamanioMano());
        this.rondas = (mano * 2) * NUM_RONDAS;
        setMazo();
        shuffle();
        
    }
    
    private void setMazo(){
        this.mazo = new ArrayList<Card>();
        for (int i = 0; i < rondas; i++) {
            Card card = new Card();
            card.setSuit();
            card.setValor();
            this.mazo.add(card);
        }
    }
    
    public void shuffle(){
        Collections.shuffle(this.mazo);
    }

    public ArrayList<Card> getMazo() {
        return mazo;
    }

    public void setMano(Integer mano) {
        this.mano = mano;
    }
    
    public Integer darTamanioMano(){
        return 10;
    }
    
    public abstract void displayDescription();
    
    public abstract Card deal();
}

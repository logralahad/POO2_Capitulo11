/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.Random;

/**
 *
 * @author logra
 */
public class Card {
    
    private Suit suit;
    private Integer valor;
    private String tipo;

    public Card() {
        this.suit = Suit.CORAZONES;
        this.valor = 1;
        setTipo();
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit() {
        randomSuit();
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor() {
        randomValue();
    }

    public String getTipo() {
        return tipo;
    }
    
    private void setTipo(){
        switch(valor) {
            case 1:
                this.tipo = "A";
                break;
                
            case 11:
                this.tipo = "J";
                break;
                
            case 12:
                this.tipo = "Q";
                break;
                
            case 13:
                this.tipo = "K";
                break;
                
            default:
                this.tipo = String.valueOf(this.valor);
                break;
        }
    }
    
    public void showCard(){
        System.out.println(String.format("%s de %s", this.tipo, this.suit));
    }
    
    public void randomSuit(){
        Suit[] tipos = Suit.values();
        Random rnd = new Random();
        
        this.suit = tipos[rnd.nextInt(tipos.length)];
    }
    
    public void randomValue(){
        Random rand = new Random();
        int val = rand.nextInt(13) + 1;
        
        this.valor = val;
        setTipo();
    }
    
}

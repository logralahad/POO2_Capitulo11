/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author logra
 */
public class War extends CardGame {
    
    private ArrayList<Card> mazo;
    private Integer tam;
    private Integer score_jugador;
    private Integer score_pc;
    private Integer empates;

    public War() {
        super();
        this.mazo = this.getMazo();
        this.tam = this.mazo.size();
        this.score_jugador = 0;
        this.score_pc = 0;
        this.empates = 0;
    }
    
    public Integer getTam(){
        return this.tam;
    }
    
    @Override
    public Integer darTamanioMano(){
        return 1;
    }
    
    public void imprimirMazo(){
        for (int i = 0; i < this.mazo.size(); i++) {
            Card copia = this.mazo.get(i);
            System.out.print("Carta " + (i + 1) + ": ");
            copia.showCard();
            this.mazo.set(i, copia);
        }
    }
    
    @Override
    public Card deal(){
        Random rd = new Random();
        int index = rd.nextInt(this.mazo.size());
        Card temp = this.mazo.get(index);
        this.mazo.remove(index);
        this.tam = this.mazo.size();
        return temp;
    }
    
    @Override
    public void displayDescription() {
        System.out.println("\nEl juego War se juega de la siguiente forma:");
        System.out.println("Se elige una carta para el jugador y una para la computadora.");
        System.out.println("El ganador es aquel que tenga la carta de mayor valor, si valen lo mismo es un empate.\n");
    }
    
    public static boolean changeCard(Card a, Card b){
        if(a.getSuit() == b.getSuit()){
            b.setSuit();
            return true;
        }
        else{
            return false;
        }
    }
    
    public void winWar(Card a, Card b){
        if(a.getValor() > b.getValor() && changeCard(a, b) == false){
            System.out.println("Jugador gano!\n");
            this.score_jugador++;
        }
        else if(a.getValor() < b.getValor() && changeCard(a, b) == false){
            System.out.println("Computadora gano!\n");
            this.score_pc++;
        }
        else{
            changeCard(a, b);
            System.out.println("Empate!\n");
            this.empates++;
        }
    }
    
    public String resultados(){
        return String.format("Jugador gano: %d\nPC gano: %d\nEmpates: %d", 
                this.score_jugador, this.score_pc, this.empates);
    }
    
}

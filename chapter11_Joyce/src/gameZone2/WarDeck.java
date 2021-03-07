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
public class WarDeck extends CardGame {
    
    private ArrayList<Card> mazo;
    private Integer tam;
    private Integer score_jugador;
    private Integer score_pc;
    private Integer empates;

    public WarDeck() {
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
        return 5;
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
        System.out.println("El juego WarDeck se juega de la siguiente forma:");
        System.out.println("Se le dan 5 cartas al jugador y a la computadora.");
        System.out.println("El ganador es aquel que tenga mas numeros de cartas del mismo valor");
        System.out.println("Si tienen la misma cantidad, se decide en base a la jerarquia.");
        System.out.println("Es decir, si son 5 AS vs 5 K, ganan K por valer mas.\n");
    }
    
    public void jugar(ArrayList<Card> mano_jugador, ArrayList<Card> mano_pc){
        if(contarRepetidos(mano_jugador) > contarRepetidos(mano_pc)){
            System.out.println("\nJugador gano!\n");
            this.score_jugador++;
        }
        else if(contarRepetidos(mano_jugador) < contarRepetidos(mano_pc)){
            System.out.println("\nComputadora gano!\n");
            this.score_pc++;
        }
        else{
            if(mayorValor(mano_jugador) > mayorValor(mano_pc)){
                System.out.println("\nJugador gano!\n");
                this.score_jugador++;
            }
            else if(mayorValor(mano_jugador) < mayorValor(mano_pc)){
                System.out.println("\nComputadora gano!\n");
                this.score_pc++;
            }
            else{
                System.out.println("\nEmpate!\n");
                this.empates++;
            }
        }
   
    }
    
    private Integer contarRepetidos(ArrayList<Card> mano){
        Integer contador = 0, maximo = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if(mano.get(j).getValor() == i){
                    contador++;
                }
            }
            if(contador > maximo){
                maximo = contador;
            }
            contador = 0;
        }
        return maximo;
    }
    
    private Integer mayorValor(ArrayList<Card> mano){
        Integer contador = 0, maximo = 0, valor = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if(mano.get(j).getValor() == i){
                    contador++;
                }
            }
            if(contador > maximo){
                maximo = contador;
                valor = i;
            }
            contador = 0;
        }
        return valor;
    }
    
    public static void imprimirMano(ArrayList<Card> mazo, String tipo){
        System.out.print("\nMano del " + tipo + ": ");
        for (int i = 0; i < mazo.size(); i++) {
            System.out.print(mazo.get(i).getTipo() + " ");
        }
    }
    
    public String resultados(){
        return String.format("Jugador gano: %d\nPC gano: %d\nEmpates: %d", 
                this.score_jugador, this.score_pc, this.empates);
    }

}

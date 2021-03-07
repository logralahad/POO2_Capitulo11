/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class StoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Story> historia = new ArrayList<>();
        
        historia.add(new Novel("78 sombras de Blue", "Kiko Poe", 120));
        historia.add(new Novella("Dias de soledad", "Rafael Marquez", 70));
        historia.add(new ShortStory("Azul vs Rojo", "Juan Perez", 15));
        
        historia.add(new Novel("69 sombras de Red", "Alan Poe", 65));
        historia.add(new Novella("Meses de soledad", "Juan Marquez", 49));
        historia.add(new ShortStory("Negro vs Transparente", "Checo Perez", 150));
        
        for (Story story : historia) {
            System.out.println(story.toString());
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author logra
 */
public class EquipmentWithoutLesson extends Equipment {

    public EquipmentWithoutLesson(Integer tipo_equipo) {
        super(tipo_equipo);
    }

    @Override
    public String lessonPolicy() {
        return "No se requiere leccion obligatoria.";
    }
    
}

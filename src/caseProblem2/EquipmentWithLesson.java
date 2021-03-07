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
public class EquipmentWithLesson extends Equipment {

    public EquipmentWithLesson(Integer tipo_equipo) {
        super(tipo_equipo);
        this.setTarifa();
    }

    @Override
    public String lessonPolicy() {
        return "Se requiere una lecccion obligatoria, que cuesta $27.";
    }
    
    @Override
    protected void setTarifa() {
        super.setTarifa();
        this.tarifa += 27;
    }
    
}

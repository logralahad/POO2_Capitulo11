/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author logra
 */
public class ShortStory extends Story {

    public ShortStory(String titulo, String autor, Integer paginas) {
        super(titulo, autor, paginas);
    }

    @Override
    public Integer calcularTamanio(Integer paginas) {
        setMensaje(determinarMensaje(paginas));
        return paginas;
    }

    @Override
    public String determinarMensaje(Integer paginas) {
        Integer diferencia = paginas - CORTO_MAX;
        if(diferencia < 0){
            return "El libro si es una historia corta";
        }
        else{
            return String.format("Sobran %d paginas para que sea historia corta", diferencia);
        }
    }
    
}
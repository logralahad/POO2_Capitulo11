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
public class Novella extends Story{

    public Novella(String titulo, String autor, Integer paginas) {
        super(titulo, autor, paginas);
    }

    @Override
    public Integer calcularTamanio(Integer paginas) {
        setMensaje(determinarMensaje(paginas));
        return paginas;
    }

    @Override
    public String determinarMensaje(Integer paginas) {
        Integer diferencia = 0;
        String msg = "";
        if(paginas < NOVELLA_MIN){
            diferencia = NOVELLA_MIN - paginas;
            msg = String.format("Faltan %d paginas para que sea novela corta", diferencia);
        }
        else if(paginas > NOVELLA_MAX){
            diferencia = paginas - NOVELLA_MAX;
            String.format("Sobran %d paginas para que sea novela corta", diferencia);
        }
        else{
            msg = "El libro si es una novela corta";
        }
        
        return msg;
    }
    
}

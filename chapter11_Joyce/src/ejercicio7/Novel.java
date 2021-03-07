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
public class Novel extends Story{

    public Novel(String titulo, String autor, Integer paginas) {
        super(titulo, autor, paginas);
    }

    @Override
    public Integer calcularTamanio(Integer paginas) {
        setMensaje(determinarMensaje(paginas));
        return paginas;
    }

    @Override
    public String determinarMensaje(Integer paginas) {
        Integer diferencia = NOVELA_MIN - paginas;
        if(diferencia < 0){
            return "El libro si es una novela";
        }
        else{
            return String.format("Faltan %d paginas para que sea novela", diferencia);
        }
        
    }
    
}

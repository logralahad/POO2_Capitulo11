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
public abstract class Story {
    
    public static final Integer NOVELA_MIN = 101;
    public static final Integer NOVELLA_MIN = 50;
    public static final Integer NOVELLA_MAX = 100;
    public static final Integer CORTO_MAX = 49;
    
    
    private String titulo;
    private String autor;
    private Integer paginas;
    private String mensaje;

    public Story(String titulo, String autor, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        setPaginas(calcularTamanio(paginas));
        setMensaje(determinarMensaje(paginas));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String toString(){
        return String.format("Titulo del libro: %s\nAutor: %s\nNum. de paginas: %d\nNota: %s\n", 
                titulo, autor, paginas, mensaje);
    }
    
    public abstract Integer calcularTamanio(Integer paginas);
    
    public abstract String determinarMensaje(Integer paginas);
    
}

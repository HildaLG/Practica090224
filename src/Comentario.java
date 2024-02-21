/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20012021
 */
public class Comentario {
    String contenido;
    Usuario autor;

    public Comentario(String contenido, Usuario autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    public void subirComentario(String contenido){
       this.contenido=contenido;             
    }
    public void mostrarInfoComentario(){
        System.out.println("Comentario: "+contenido);
    }
    
}

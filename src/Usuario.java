/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20012021
 */
public class Usuario {
    
    String Nombre;
    Video videoSubido;
    
    
    public Usuario (String Nombre){
        this.Nombre=Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Video getVideoSubido() {
        return videoSubido;
    }

    public void setVideoSubido(Video videoSubido) {
        this.videoSubido = videoSubido;
    }
    /*METODOS*/
    public void subirVideo(Video videoSubido){
       this.videoSubido=videoSubido;             
    }

    public void mostrarinfoUsuario(){
       System.out.println("Usuario: "+ Nombre);
       if (videoSubido != null){
       System.out.println("Ultimo video subido: "+videoSubido.getTitulo());
       }else{
       System.out.println("Aun no ha subido ningun video!");
       }
    }
    
    
    
}

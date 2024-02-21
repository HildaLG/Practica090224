/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20012021
 */
public class Pagina {
     public static void main(String[] args) {
        Usuario alum1= new Usuario ("Hilda");
        Video video1=new Video ("Mi video",60,"https.//blablabla");
        Comentario comen1=new Comentario ("que mal video",alum1);
        alum1.subirVideo(video1);
        alum1.mostrarinfoUsuario();
       
        comen1.getContenido();
        
        comen1.mostrarInfoComentario();
    }
    
}

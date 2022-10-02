/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?

 */
package tema3;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class Ej3Clase3 {
   public static void main(String[] args){
       Estante E = new Estante();
       int contador = 0;
       String title;
       for(int i = 0; i<4;i ++){
           System.out.println("Inserte libro: ");
           title = Lector.leerString();
           System.out.println("Su autor, Su historia y si es negro o no");
           Autor A = new Autor(Lector.leerString(),"----------",Lector.leerString());
           Libro Li = new Libro(title,GeneradorAleatorio.generarString(4),GeneradorAleatorio.generarInt(4),A,GeneradorAleatorio.generarString(20),GeneradorAleatorio.generarDouble(4));
           E.setAppend(Li);
           System.out.println("Se agrego un elemeto en la posicion: "+ contador);
           contador ++;
       }
        System.out.println("Vamos a buscar el autor del libro Mujercitas");
        System.out.println(E.getAutorLibro("Mujercitas")); 
    //E.setVector();
       
   } 
}


package tema1;

// import PaqueteLectura.*;
import PaqueteLectura.GeneradorAleatorio;
public class Ej01Tabla2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        System.out.println("2x" + "5" + "="+ tabla2[5]);
        int intAlt = GeneradorAleatorio.generarInt(12);
        while(intAlt != 11){
            System.out.println("2x "+ intAlt + " = "+tabla2[intAlt]);
            intAlt = GeneradorAleatorio.generarInt(12);
        }
    }
    
}
//Macdonald jkkjjkjkjkjkjjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjjkjjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjk
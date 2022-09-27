

package tema1;

import PaqueteLectura.*;

public class Demo05Generador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();                              //inicia el generador aleatorio
        System.out.println(GeneradorAleatorio.generarInt(10));    //genera un int entre 0 y 9
        System.out.println(GeneradorAleatorio.generarDouble(10)); //genera un double entre 0 y 9
        System.out.println(GeneradorAleatorio.generarBoolean());  //genera un boolean
        System.out.println(GeneradorAleatorio.generarString(4));  //genera un string de 4 letras
    }
    
}

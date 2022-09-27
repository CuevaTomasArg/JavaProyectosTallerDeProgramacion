/*
 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
 */
package tema1;

import PaqueteLectura.Lector;
public class Ejerciico4Clase1 {
     public static void main(String[] args){
         //Inicializo la matriz
         int piso = 8;
         int ofi = 4;
         int [][] varmatris = new int[piso][ofi];
         
         //Variables primitivas
         int perpiso,perofi;
         int i,j; //Indices
         
         //Inicializo contador materiz
         for(i = 0;i<piso;i ++){
            for(j = 0;j<ofi;j ++){
                varmatris [i][j] = 0;
            }
        }
         
        System.out.println("Que piso queri ir: ");
        perpiso = Lector.leerInt();
        System.out.println("Ofi?");
        perofi = Lector.leerInt();
        
        //Arranco a contar la gente que llega
        while(piso != 9){
            varmatris[perpiso][perofi] ++; 
            System.out.println("Que piso queri ir: ");
            perpiso = Lector.leerInt();
            System.out.println("Ofi?");
            perofi = Lector.leerInt();
        }
        
        int acum = 0;
        
        for(i = 0;i<piso;i ++){
            for(j = 0;j<ofi;j ++){
                acum += varmatris[i][j];
                System.out.println("Entraron: "+varmatris[i][j]+" personas A" + i + " "+ j);
            }
        }
        
        System.out.println("Entraron: "+acum+" personas");
        
    }
}

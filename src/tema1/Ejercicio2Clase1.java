/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author tomas
 */
import PaqueteLectura.Lector;
public class Ejercicio2Clase1 {
    public static void main(String[] args){
        System.out.println("Pagar el programa");
        System.out.println("Pagarel programa");
        System.out.println("Pagar el programa");
        System.out.println("Pagar  macri el programa");
        int dimF = 5;
        double[]alturas = new double[dimF];
        double acumProm = 0;
        int i;
        for(i = 0;i<dimF; i ++){
            System.out.println("posicion: "+ i);
            System.out.println("Defina la altura del jugador: ");
            alturas[i] = Lector.leerDouble();
            acumProm += alturas[i];
        }
        
        
        double prom = acumProm / dimF;
        for(i = 0;i<dimF;i++)
            System.out.println(alturas[i]);
        //Imprimir el promedio
        System.out.println(prom);
        
        int maxProm = 0;
        for(i = 0;i<dimF; i += 1){
            if(alturas[i] > prom)
                maxProm ++;
        }
        System.out.println("La cantidad que supera" + maxProm);
    }
    
}

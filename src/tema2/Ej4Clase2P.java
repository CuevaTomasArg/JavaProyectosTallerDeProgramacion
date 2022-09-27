/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

// import PaqueteLectura.Lector.*;
import PaqueteLectura.GeneradorAleatorio;

public class Ej4Clase2P {
    public static void main(String[] args){
        int Edad,DNI;
        String nombre;
        Persona p = new Persona();
        Persona [][] personas = new Persona[8][5];
        int i = 0;
        int j = 0;
        int finI,finJ;
        nombre = GeneradorAleatorio.generarString(10);
        while((i<5)&&(!nombre.equals("ZZZ"))){ 
            j = 0;
            while((j<8)&&(!nombre.equals("ZZZ"))){
                
                Edad = GeneradorAleatorio.generarInt(80);
                DNI = GeneradorAleatorio.generarInt(10000000);
                //System.out.println(DNI);
                p.setDNI(DNI);
                p.setEdad(Edad);
                p.setNombre(nombre);
                personas [j][i] = p;
                nombre = GeneradorAleatorio.generarString(10);
                j++;    
            }
            i++;
        }
        p.setDNI(000);
        personas[j][i].setDNI(p.getDNI());
        finI = i;
        finJ = j;
        for(i=0;finI<5;i++){
            for(j=0;finJ<8;j++){
                System.out.println(personas[j][i].getDNI());
                System.out.println(personas[j][i].getEdad());
                System.out.println(personas[j][i].getNombre());
            }
        }
        
    }
}

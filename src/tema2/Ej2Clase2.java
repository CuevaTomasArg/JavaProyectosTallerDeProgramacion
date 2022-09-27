/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;
public class Ej2Clase2 {
    public static void main(String[] args){
        Persona [] vecPer = new Persona[15];
        Persona people = new Persona(); 
        int dimL = 0;
        int e = people.setEdad(80);
        int dni;
        String nombre;
        while((e != 0)&&(dimL<15)){
            nombre = GeneradorAleatorio.generarString(10);
            dni = GeneradorAleatorio.generarInt(44000000);
            vecPer [dimL] = new Persona(nombre,dni,e);
            dimL ++;
            e = GeneradorAleatorio.generarInt(150);
                    
        }
        int cant65=0;
        Persona pmin = new Persona();
        pmin.setDNI(50000000);
        int x;
        for(x=0;x<dimL;x++){
            if(vecPer[x].getEdad()>65)
                cant65 ++;
            if(vecPer[x].getDNI()< pmin.getDNI()){
            /*pmin.setDNI(vecPer[x].getDNI());
            pmin.setEdad(vecPer[x].getEdad());
            pmin.setNombre(vecPer[x].getNombre());*/
            pmin = vecPer[x];
        }
        }
        System.out.print("La cantiad de personas mayores a 65 anios: "+ cant65);
        System.out.print("La persona mas chica es: "+ pmin.toString());
    }
}

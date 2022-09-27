
package tema2;

import PaqueteLectura.*;;
public class Ej1Clase2 {
    public static void main(String[] args){
        Persona people = new Persona(); 
        System.out.print("Nombre: ");
        people.setNombre(Lector.leerString());
        System.out.print("Edad: ");
        people.setEdad(Lector.leerInt());
        System.out.print("DNI: ");
        people.setDNI(Lector.leerInt());
        
        System.out.print("Ya se leyo todo, gracias.");
        
        // String nombre = people.getNombre();
        // System.out.println(people.toString());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;
public class Ej4Clase3 {
    public static void main(String[] args){
        Cliente cliente;
        Habitacion habitacion;
        int pisos = 2;
        int habitaciones = 2;
        int p,h;
        int cont = 0;
        Hotel hotel = new Hotel(pisos,habitaciones);
        hotel.toString();
        String terminar = "n";
        boolean fin =  terminar.equals("n");
        while(fin && cont<pisos*habitaciones){
            cliente = new Cliente();
            habitacion = new Habitacion();
            System.out.println("-----------");
            System.out.println("Informacion del cliente: ");
            System.out.println("DNI: ");
            cliente.setDNI(Lector.leerInt());
            System.out.println("Nombre: ");
            cliente.setNombre(Lector.leerString());
            System.out.println("Edad: ");
            cliente.setEdad(Lector.leerInt());
            System.out.println("Piso Nro: ");
            p = Lector.leerInt();
            System.out.println("Habitacion Nro: ");
            h = Lector.leerInt();
            habitacion.postHabitacion(cliente,p,h);
            System.out.println(habitacion.toString());
            hotel.postHabitacion(habitacion);
            System.out.println("¿DESEA CONTINUAR?: ");
            terminar = Lector.leerString();
            fin =  terminar.equals("n");
        }
        hotel.toString();
    }
}

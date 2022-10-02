/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author tomas
 */
public class Cliente {
    private String nombre;
    private int DNI;
    private int edad;
    public Cliente(){
        
    }
    public Cliente(String nombre,int DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDNI(int DNI){
        this.DNI = DNI;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public int getDNI(){
        return this.DNI ;
    }
    public int getEdad(){
        return this.edad;
    }
    public String toString(){
        String aux = "Nombre: "+this.nombre+"DNI: "+this.DNI+"Edad: "+this.edad;
        return aux;
    }
}

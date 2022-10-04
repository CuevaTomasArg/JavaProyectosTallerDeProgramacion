/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author tomas
 */
public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleado(String nombre, double sueldo, int antiguedad){
        setNombre(nombre);
        setSueldo(sueldo);
        setAntiguedad(antiguedad);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public double calcularSueldo(){
        return this.sueldo+(antiguedad* (this.sueldo*0.1));
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public abstract double calcularEfectividad();
    
    public abstract double calcularSueldoACobrar();
    
    public String toString(){
        return "Nombre: "+ this.nombre+ "Sueldo a cobrar: " +this.sueldo +"Efectividad: " +this.calcularEfectividad();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public class Jugador extends Empleado {
    private int cantPartidos;
    private int goles;
    
    public Jugador(int cantPartidos, int goles, String nombrea, double sueldoa, int antiguedad){
        super(nombrea,sueldoa,antiguedad);
        setCantPartidos(cantPartidos);
        setGoles(goles);
    }
    
    
    public void setCantPartidos(int Cant){
        this.cantPartidos = Cant;
    }
    
    public void setGoles(int goles){
        this.goles = goles;
    }
    
    public double calcularEfectividad(){
        return this.goles/this.cantPartidos;
    }
    
    public double calcularSueldoACobrar(){
        if(this.calcularEfectividad() >0.5){
            return  super.calcularSueldo()+super.getSueldo();
        }
        return super.calcularSueldo();
    }
    
    public String toString(){
        return super.toString() + "Cantidad de partidos: "+this.cantPartidos+" cantidad de goles: "+ goles;
    }
        
    
}

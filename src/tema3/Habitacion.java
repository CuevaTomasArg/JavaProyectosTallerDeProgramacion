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
import PaqueteLectura.GeneradorAleatorio;
public class Habitacion {
    private double costo;
    private boolean ocupada;
    private Cliente cliente;
    private int piso;
    private int habitacion;
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Habitacion(){
        double precio = GeneradorAleatorio.generarDouble(8001);
        while(precio<2000){
            precio = GeneradorAleatorio.generarDouble(8001);
        }
        this.costo = precio;
        this.ocupada = false;
    }
    public void postHabitacion(Cliente cliente,int piso,int habitacion){
        this.ocupada = true;
        this.cliente = cliente;
        this.piso = piso;
        this.habitacion = habitacion;
    }
    
    public String getCliente(){
        return this.cliente.toString();
    }
    public int getPiso(){
        return this.piso;
    }
    public int getHabitacion(){
        return this.habitacion;
    }
    public void setPrecio(double monto){
        this.costo += monto;
    }
    
    public String toString(){
        String aux;
        if(this.ocupada){
            aux = "La habitacion cuesta $"+this.costo+ " y esta ocupada por el Cliente: "+this.cliente.toString();
            return aux;
        }else{
            aux = "La habitacion cuesta $"+this.costo+" y no esta ocupada.";
            return aux;    
        }
    }
}
    


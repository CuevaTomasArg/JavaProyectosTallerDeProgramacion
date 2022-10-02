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
public class Hotel {
    private int dimFF;
    private int dimFC;
    private int [] index;
    private Habitacion [][] hotel;
    public Hotel(int dimFF,int dimFC){
        this.dimFF = dimFF;
        this.dimFC = dimFC;
        this.hotel = new Habitacion [dimFF][dimFC];
        this.index = new int[dimFF*dimFC];
        for(int i=0;i<dimFF;i++){
            for(int j=0;j<dimFC;j++){
                Habitacion habitacion = new Habitacion();
                this.hotel [i][j] = habitacion;
            }
        }
    }
    public void postHabitacion(Habitacion X){
        this.hotel [X.getPiso()][X.getHabitacion()] = X;
    }
    
    public void setPrecios(double costo){
        for(int i=0;i<dimFF;i++){
            for(int j=0;j<dimFC;j++){
                this.hotel [i][j].setPrecio(costo);
            }
        }
    }
    public String toString(){
        for(int i=0;i<dimFF;i++){
            for(int j=0;j<dimFC;j++){
                System.out.println(this.hotel [i][j].toString());  
            }
        }
        return "FIn";
    }
}

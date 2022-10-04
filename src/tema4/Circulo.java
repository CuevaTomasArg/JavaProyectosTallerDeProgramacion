/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio,String relleno, String color){
        super(relleno,color);
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    
    
    public double calcularPerimetro(){
        return Math.PI*2*this.radio;
    }
    
    
}

/*
1-A- Incluya la clase Tri�ngulo a la jerarqu�a de figuras vista (carpeta tema4). Tri�ngulo
debe heredar de Figura todo lo que es com�n y definir su constructor y sus atributos y
m�todos propios. Adem�s debe redefinir el m�todo toString.
B- De igual manera, incluya la clase C�rculo a la jerarqu�a de figuras.
C- A�ada a la representaci�n String el valor del per�metro. Piense �qu� m�todo toString
debe modificar: el de cada subclase o el de Figura?
D- A�ada el m�todo despintar que establece los colores de la figura a l�nea �negra� y
relleno �blanco�. Piense �d�nde debe definir el m�todo: en cada subclase o en Figura?
E- Realizar un programa que instancie un tri�ngulo y un c�rculo. Muestre en consola la
representaci�n String de cada uno. Pruebe el funcionamiento del m�todo despintar.
 */
package tema4;


        
public class Triangulo extends Figura {
    private int lado1,lado2,lado3;
    
    public Triangulo(int unLado1,int unLado2,int unLado3,String unBorde,String unRelleno){
        super(unRelleno,unBorde);
        lado1=unLado1;
        lado2=unLado2;
        lado3=unLado3;
        
    }
    public Triangulo(){
    }
    
    public int getLado1(){
        return lado1;
    }
    
    public int getLado2(){
        return lado2;
    }
    
    public int getLado3(){
        return lado3;
    }
    
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    
    public double calcularArea(){
        double s=(lado1+lado2+lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public void setLado1(int unLado1){
        lado1=unLado1; 
    }
    
    public void setLado2(int unLado2){
        lado2=unLado2;
    }
    
    public void setLado3(int unLado3){
        lado3=unLado3;
    }
    
    public String toString(){
        String aux = super.toString()+ " " + "Lados: " + getLado1() + " "+ getLado2() + " " + getLado3();
        return aux;
    }
}
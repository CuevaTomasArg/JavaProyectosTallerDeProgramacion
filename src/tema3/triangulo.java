/*1-A- Definir una clase para representar triángulos. 
Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno 
(String) y el color de 
línea
(String).
Provea un constructor que reciba todos los datos necesarios 
para iniciar el 
objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
NOTA: Calcular el área con la fórmula Área = √s(s − a)(s − b)(s − c) , donde a, b y c son
los lados y s =
a+b+c
2
. La función raíz cuadrada es Math.sqrt(#)*/
package tema3;

/**
 *
 * @author tomas
 */
public class triangulo {
    private double lado1,lado2,lado3;
    private String relleno;
    private String color;
    
    public triangulo(double unlado1,double unlado2,double unlado3,String backgroud, String croma){
        lado1 = unlado1;
        lado2 = unlado2;
        lado3 = unlado3;
        relleno = backgroud;
        color = croma;
    }
    public triangulo(){
        
    }
    public void setSide1(double newSide){
        lado1 = newSide;
    }
    public void setSide2(double newSide){
        lado2 = newSide;
    }
    public void setSide3(double newSide){
        lado3 = newSide;
    }
    public double setSide1(){
        return lado1 ;
    }
    public double setSide2(){
        return lado2 ;
    }
    public double setSide3(){
        return lado3 ;
    }
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    public double calcularArea(){
        double S = (lado1+lado2+lado3)/2;
        return  Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
    }
    
}


package tema3;

import PaqueteLectura.Lector;
public class Ej1Clase3 {
    public static void main(String[] args){
        System.out.println("Lado 1: ");
        double side1 = Lector.leerDouble();
        System.out.println("Lado 2: ");
        double side2 = Lector.leerDouble();
        System.out.println("Lado 3: ");
        double side3 = Lector.leerDouble();
        System.out.println("Color de los lados: ");
        String color = Lector.leerString();
        System.out.println("Color de relleno: ");
        String backgroundColor = Lector.leerString();
        triangulo triangle = new triangulo(side1,side2,side3,backgroundColor,color);
        
        System.out.println(triangle.calcularArea());
        System.out.println(triangle.calcularPerimetro());
    }
}

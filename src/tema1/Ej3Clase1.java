package tema1;
/*
3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
NOTA: Dispone de un esqueleto para este programa en Ej03Matrices.java

 */
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej3Clase1 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar(); 
        //Zona generadora de la matriz
        int filas = 5;
        int columnas = 5;
        //filas += columnas;
        int [][] matriz5x5 = new int[filas][columnas];
        int i,j;
        //Acumulador
        int acumF1 = 0;
        //Vector de 5
        int [] vecto5 = new int [filas];
        //Cargo la matriz
        for(i = 0;i<filas;i ++){
            for(j = 0;j<columnas;j ++){
                matriz5x5[i][j] = GeneradorAleatorio.generarInt(31);
            }
        }
        // Imprimo lo de todas las matrices
        for(i = 0;i<filas;i ++){
            for(j = 0;j<columnas;j ++){
                System.out.println("Fila: "+i);
                System.out.println("columna: "+j);
                System.out.println(matriz5x5[i][j]) ;
            }
        }
        //Duma de los elementos de la fila 1
       /* for(i = 0;i<columnas;i ++ ){
            acumF1 += matriz5x5[1][i];
        }
        System.out.println("La suma de los elementos de la fila 1 es: "+ acumF1);
        //Crear el vector
        for(i = 0;i<filas; i++){
            int sum = 0;
            for(j = 0;j<columnas; j++){
                sum +=  matriz5x5[j][i];
            }
            vecto5[i]= sum;
            System.out.println("La suma es: "+ sum);
        }
        for(i = 0; i<filas; i++){
            System.out.println("position "+i+" resultados "+ vecto5[i]);
        }
*/
        //Leer una wea y imprimir si esyta
        System.out.println("Por favor, pone un entero sino se rompe todo: ");
        int entero = Lector.leerInt();
        boolean existe = true;
        i = 0;
        j = 0;
        while(existe && i < filas){
            while(existe && j <columnas ){
                if (matriz5x5 [i][j] == entero )
                    existe = false;
                j ++;
            }
            i++;
        }
        if (existe == false)
            System.out.println("esite");
        else
            System.out.println("no esite");
        
        
        
    }
}

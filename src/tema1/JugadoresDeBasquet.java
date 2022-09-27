package tema1;
import PaqueteLectura.Lector;
public class JugadoresDeBasquet {
    public static void main(String[] args){
        System.out.println("Inicia el programa 123");
        System.out.println("Inicia el programa");
        int dimF = 5;
        double[]alturas = new double[dimF];
        double acumProm = 0;
        int i;
        for(i = 0;i<dimF; i ++){
            System.out.println("posicion: "+ i);
            System.out.println("Defina la altura del jugador: ");
            alturas[i] = Lector.leerDouble();
            acumProm += alturas[i];
        }
        
        
        double prom = acumProm / dimF;
        for(i = 0;i<dimF;i++)
            System.out.println(alturas[i]);
        //Imprimir el promedio
        System.out.println("La altura prom es: "+prom);
        
    }
}

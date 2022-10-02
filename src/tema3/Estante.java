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
public class Estante {
    private int dimF = 20;
    private int dimL = 0;
    private Libro [] V;
    
    public Estante(){
        // int [][] varmatris = new int[piso][ofi];
        V = new Libro [dimF];
    }
    // (i) devolver la cantidad de libros que almacena
    public int getCantidad(){
        return dimL;
    }
    
    //(ii) devolver si el estante está lleno
    public boolean getFull(){
        return this.dimL==this.dimF;
    }
    //(iii) agregar un libro al estante
    public void setAppend(Libro Li){
        if(dimL < dimF){
            V[dimL] = Li;
            dimL ++;
        }
        else
            System.out.println("No hay espacio.");
    }
    
    //(iv) devolver el libro con un título particular que se recibe.
    public String getAutorLibro(String bus){
        int i = 0;
        while((i<dimL)&&(! this.V[i].getTitulo().equals(bus))){
            System.out.println(this.V[i].getTitulo());
            i++;
        }
        if(i>=dimL)
            i --;
        if(this.V[i].getTitulo().equals(bus))
            return this.V[i].getPrimerAutor().getNombre();
        else
            return "No se encuentra el libro que solicito";
    }
    public void setVector(){
        for(int i= 0;i<dimL;i++){
            System.out.println("-----------------------");
            System.out.println("Libro: "+i);
            System.out.println("Año de edicion: "+this.V[i].getAñoEdicion());
            System.out.println("Editorial: "+this.V[i].getEditorial());
            System.out.println("ISBN: "+this.V[i].getISBN());
            System.out.println("Precio: "+this.V[i].getPrecio());
            System.out.println("Primer autor: "+this.V[i].getPrimerAutor());
            System.out.println("Titulo: "+this.V[i].getTitulo());
            System.out.println("-----------------------");
        }
    }
    
    
    
    
}

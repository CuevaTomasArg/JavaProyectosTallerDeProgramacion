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
public class Autor {
    private String nombre;
    private String boigrafia;
    private String origen;
    
    public Autor(String nombre,String bio,String nac){
        this.nombre = nombre;
        this.boigrafia = bio;
        this.origen = nac;
    }
    
    public Autor(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setBiografia(String bio){
        this.boigrafia = bio;
    }
    
    public void setNacionalidad(String nac){
        origen = nac;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getBiografia(){
        return boigrafia;
    }
    
    public String getNacionalidad(){
        return origen;
    }
    
    public String toString(){
        String aux = "El autor es "+nombre+", su nacionalidad es "+origen+", y esta es su historia: "+boigrafia;
        return aux;
    }
}

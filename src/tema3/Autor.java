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
    private String name;
    private String biographi;
    private String nacionalidad;
    
    public Autor(String nombre,String bio,String nac){
        name = nombre;
        biographi = bio;
        nacionalidad = nac;
    }
    
    public Autor(){
        
    }
    
    public void setNombre(String nombre){
        name = nombre;
    }
    
    public void setBiografia(String bio){
        biographi = bio;
    }
    
    public void setNacionalidad(String nac){
        nacionalidad = nac;
    }
    
    
    public String getNombre(){
        return name;
    }
    
    public String getBiografia(){
        return biographi;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public String toString(){
        String aux = "El autor es "+name+", su nacionalidad es "+nacionalidad+", y esta es su historia: "+biographi;
        return aux;
    }
}

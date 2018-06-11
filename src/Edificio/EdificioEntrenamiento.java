/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;





/**
 *
 * @author CARLOS
 */
public class EdificioEntrenamiento extends  Edificio {
    private int vida;
 
   
    private String nombre;
  public EdificioEntrenamiento(EdificioBuilder builder ) {
        this.vida=builder.vida;
        this.nombre=builder.nombre;
     }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    

   

    
@Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   
    public static class EdificioBuilder{
        private int vida;
    
   
    private String nombre;
        
        public  EdificioBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
     
        public EdificioBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
       
        
        public  EdificioEntrenamiento build(){
            return new EdificioEntrenamiento(this);
        }
    
}
}
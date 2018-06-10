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
public class EdificioRecurso1 extends Edificio {
   private int vida;
   private int construccion;
   private int trabajo;
   private int acum;
   private int cantidadProducida;

    public EdificioRecurso1(EdificioBuilder builder) {
        this.vida = builder.vida;
        this.construccion = builder.construccion;
        this.trabajo = builder.trabajo;
        this.acum = builder.acum;
        this.cantidadProducida = builder.cantidadProducida;
    }
   

    

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    @Override
    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
   
   public static class EdificioBuilder{
        private int vida;
           private int construccion;
   private int trabajo;
   private int acum;
   private int cantidadProducida;
        
        public  EdificioBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
        public  EdificioBuilder cantidadProducida(int cantidadProducida){
            this.cantidadProducida=cantidadProducida;
            return this;
        }
        public  EdificioBuilder trabajo(int trabajo){
            this.trabajo=trabajo;
            return this;
        }
        public  EdificioBuilder acum(int acum){
            this.acum=acum;
            return this;
        }
        public  EdificioBuilder construccion(int construccion){
            this.construccion=construccion;
            return this;
        }
        
        public  EdificioRecurso1 build(){
            return new EdificioRecurso1(this);
        }
   } 
}

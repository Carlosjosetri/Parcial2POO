/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Milicias.*;


/**
 *
 * @author CARLOS
 */
public class Vehiculo1 implements VehiculoPadre {
    private String nombre;
    private int ataque;
    private int vida;
    public Vehiculo1(RecursoBuilder builder) {
        this.nombre = builder.nombre;
        this.ataque = builder.ataque;
        this.vida = builder.vida;
    }



    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
@Override
    public String getNombre() {
        return nombre;
    }
@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public int getataque() {
        return ataque;
    }
@Override
    public void setataque(int ataque) {
        this.ataque = ataque;
    }
   public static class RecursoBuilder{
     private String nombre;
    private int ataque;
     private int vida;
       public  RecursoBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
       public  RecursoBuilder ataque(int ataque){
            this.ataque=ataque;
            return this;
        }
       public  RecursoBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
        
        public  Vehiculo1 build(){
            return new Vehiculo1(this);
        }
    }
 
    
}

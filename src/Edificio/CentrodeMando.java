/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;


import Milicias.miliciapadre;
import Vehiculos.VehiculoPadre;
import java.util.ArrayList;
import recursos.recurso;

/**
 *
 * @author CARLOS
 */
public class CentrodeMando extends  Edificio {
    private int vida;
    public ArrayList<recurso> recurso1;
    public ArrayList<recurso>   recurso2;
    public ArrayList<recurso>  recurso3;
    int nivel;
    private String nombre;
    public ArrayList<miliciapadre> miliciasa;
    public ArrayList<VehiculoPadre> vehiculosa;
  public CentrodeMando(EdificioBuilder builder ) {
        this.vida=builder.vida;
        this.nombre=builder.nombre;
        recurso1=new ArrayList<>();
        recurso2=new ArrayList<>();
        recurso3=new ArrayList<>();
        miliciasa=new ArrayList<>();
        vehiculosa=new ArrayList<>();
        this.nivel=builder.nivel;
    }
    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    

   

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   
    public static class EdificioBuilder{
        private int vida;
    
    int nivel;
    private String nombre;
        
        public  EdificioBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
        public  EdificioBuilder nivel(int nivel){
            this.nivel=nivel;
            return this;
        }
        public EdificioBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
        
        
        public  CentrodeMando build(){
            return new CentrodeMando(this);
        }
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

import recursos.Recurso1;
import recursos.Recurso2;
import recursos.Recurso3;

/**
 *
 * @author CARLOS
 */
public class CentrodeMando extends  Edificio {
    private int vida;
    private Recurso1 recurso1;
    private Recurso2  recurso2;
    private Recurso3  recurso3;
    int nivel;
    private String nombre;
  public CentrodeMando(EdificioBuilder builder ) {
        this.vida=builder.vida;
        this.nombre=builder.nombre;
        this.recurso1=builder.recurso1;
        this.recurso2=builder.recurso2;
        this.recurso3=builder.recurso3;
        this.nivel=builder.nivel;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Recurso1 getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(Recurso1 recurso1) {
        this.recurso1 = recurso1;
    }

    public Recurso2 getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(Recurso2 recurso2) {
        this.recurso2 = recurso2;
    }

    public Recurso3 getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(Recurso3 recurso3) {
        this.recurso3 = recurso3;
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
            private Recurso1 recurso1;
    private Recurso2  recurso2;
    private Recurso3  recurso3;
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
         public  EdificioBuilder recurso1(Recurso1 recurso1){
             this.recurso1=recurso1;
             return this;
         }
         public  EdificioBuilder recurso2(Recurso2 recurso2){
             this.recurso2=recurso2;
             return this;
         }
         public  EdificioBuilder recurso3(Recurso3 recurso3){
             this.recurso3=recurso3;
             return this;
         }
        
        public  CentrodeMando build(){
            return new CentrodeMando(this);
        }
    
}
}
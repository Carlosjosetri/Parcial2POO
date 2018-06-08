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
public class CentrodeMando extends  Edificio {
    private int vida;
    private int recurso1;
    private int recurso2;
    private int recurso3;
    int nivel;
  public CentrodeMando(EdificioBuilder builder ) {
        this.vida=builder.vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }
    public static class EdificioBuilder{
        private int vida;
        
        public  EdificioBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
        
        public  CentrodeMando build(){
            return new CentrodeMando(this);
        }
    
}
}
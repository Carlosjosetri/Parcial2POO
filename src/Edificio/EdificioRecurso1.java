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
   

    public EdificioRecurso1(EdificioBuilder builder ) {
        this.vida=builder.vida;
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
        
        public  EdificioBuilder vida(int vida){
            this.vida=vida;
            return this;
        }
        
        public  EdificioRecurso1 build(){
            return new EdificioRecurso1(this);
        }
   } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicias;


/**
 *
 * @author CARLOS
 */
public class Miliciaespecial implements miliciapadre {
    private String nombre;
    private int ataque;

    public Miliciaespecial(RecursoBuilder builder) {
        this.nombre = builder.nombre;
        this.ataque = builder.ataque;
    }

    public Miliciaespecial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
       public  RecursoBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
       public  RecursoBuilder ataque(int ataque){
            this.ataque=ataque;
            return this;
        }
        
        public  Miliciaespecial build(){
            return new Miliciaespecial(this);
        }
    }
 
    
}

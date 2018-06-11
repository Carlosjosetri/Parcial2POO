/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author CARLOS
 */
public class Recurso3 implements recurso {
    private String nombre;
    private int cantidad;

    public Recurso3(RecursoBuilder builder) {
        this.nombre = builder.nombre;
        this.cantidad = builder.cantidad;
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
    public int getCantidad() {
        return cantidad;
    }
@Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   public static class RecursoBuilder{
     private String nombre;
    private int cantidad;
    
       public  RecursoBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
       public  RecursoBuilder cantidad(int cantidad){
            this.cantidad=cantidad;
            return this;
        }
        
        public  Recurso3 build(){
            return new Recurso3(this);
        }
    }
 
    
}

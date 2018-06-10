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
public class Recurso1 implements recurso {
    private String nombre;
    private int cantidad;

    public Recurso1(RecursoBuilder builder) {
        this.nombre = builder.nombre;
        this.cantidad = builder.cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

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
        
        public  Recurso1 build(){
            return new Recurso1(this);
        }
}
 
    
}

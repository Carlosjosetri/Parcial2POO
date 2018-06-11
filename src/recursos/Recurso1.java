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

    public Recurso1() {
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
        
        public  Recurso1 build(){
            return new Recurso1(this);
        }
}
 
    
}

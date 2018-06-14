/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

import Milicias.miliciapadre;
import Vehiculos.VehiculoPadre;
import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class EdificioEntrenamiento extends Edificio {

    private int vida;
    private int Precio1;
    private int Precio2;
    private int Precio3;
    private int Trabajo;
    private int Construccion;
    private int acumt;
    private int acumc;
    private boolean disponiblilidad;
    private String disponible;
    private boolean trabajando;
    private String nombre;
    public String codigo;
        public ArrayList<miliciapadre> miliciasa;
    public ArrayList<VehiculoPadre> vehiculosa;
    public EdificioEntrenamiento(EdificioBuilder builder) {
        this.vida = builder.vida;
        this.Precio1 = builder.Precio1;
        this.Precio2 = builder.Precio2;
        this.Precio3 = builder.Precio3;
        this.Trabajo = builder.Trabajo;
        this.Construccion = builder.Construccion;
        this.acumt = builder.acumt;
        this.acumc = builder.acumc;
        this.nombre = builder.nombre;
        this.disponible = builder.disponible;
        this.disponiblilidad = builder.disponiblilidad;
        this.trabajando=false;
        this.codigo="N1E2S3T4O5R6";
           miliciasa=new ArrayList<>();
        vehiculosa=new ArrayList<>();
    }

    @Override
    public boolean isTrabajando() {
        return trabajando;
    }
 @Override
    public void setTrabajando(boolean trabjando) {
        this.trabajando = trabjando;
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
    public boolean isDisponiblilidad() {
        return disponiblilidad;
    }
 @Override
    public void setDisponiblilidad(boolean disponiblilidad) {
        this.disponiblilidad = disponiblilidad;
    }
 @Override
    public String getDisponible() {
        return disponible;
    }
 @Override
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
 @Override
    public int getPrecio1() {
        return Precio1;
    }
 @Override
    public void setPrecio1(int Precio1) {
        this.Precio1 = Precio1;
    }
 @Override
    public int getPrecio2() {
        return Precio2;
    }
 @Override
    public void setPrecio2(int Precio2) {
        this.Precio2 = Precio2;
    }
 @Override
    public int getPrecio3() {
        return Precio3;
    }
 @Override
    public void setPrecio3(int Precio3) {
        this.Precio3 = Precio3;
    }
 @Override
    public int getTrabajo() {
        return Trabajo;
    }
 @Override
    public void setTrabajo(int Trabajo) {
        this.Trabajo = Trabajo;
    }
 @Override
    public int getConstruccion() {
        return Construccion;
    }
 @Override
    public void setConstruccion(int Construccion) {
        this.Construccion = Construccion;
    }
 @Override
    public int getAcumt() {
        return acumt;
    }
 @Override
    public void setAcumt(int acumt) {
        this.acumt = acumt;
    }
 @Override
    public int getAcumc() {
        return acumc;
    }
 @Override
    public void setAcumc(int acumc) {
        this.acumc = acumc;
    }
 @Override
    public String getNombre() {
        return nombre;
    }
 @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static class EdificioBuilder {

        private int vida;
        private int Precio1;
        private int Precio2;
        private int Precio3;
        private int Trabajo;
        private int Construccion;
        private int acumt;
        private int acumc;
        int nivel;
        private boolean disponiblilidad;
        private String disponible;
        private String nombre;

        public EdificioBuilder vida(int vida) {
            this.vida = vida;
            return this;
        }

        public EdificioBuilder Precio1(int Precio1) {
            this.Precio1 = Precio1;
            return this;
        }

        public EdificioBuilder Precio2(int Precio2) {
            this.Precio2 = Precio2;
            return this;
        }

        public EdificioBuilder Precio3(int Precio3) {
            this.Precio3 = Precio3;
            return this;
        }

        public EdificioBuilder Trabajo(int Trabajo) {
            this.Trabajo = Trabajo;
            return this;
        }

        public EdificioBuilder Construccion(int Construccion) {
            this.Construccion = Construccion;
            return this;
        }

        public EdificioBuilder acumt(int acumt) {
            this.acumt = acumt;
            return this;
        }

        public EdificioBuilder acumc(int acumc) {
            this.acumc = acumc;
            return this;
        }

        public EdificioBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EdificioBuilder disponible(String disponible) {
            this.disponible = disponible;
            return this;
        }

        public EdificioBuilder disponiblilidad(boolean disponiblilidad) {
            this.disponiblilidad = disponiblilidad;
            return this;
        }

        public EdificioEntrenamiento build() {
            return new EdificioEntrenamiento(this);
        }

    }
}

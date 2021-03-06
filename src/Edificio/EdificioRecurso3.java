/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

import Milicias.miliciapadre;
import Vehiculos.VehiculoPadre;
import java.util.ArrayList;
import recursos.Factoryrecursos;
import recursos.recurso;

/**
 *
 * @author CARLOS
 */
public class EdificioRecurso3 extends Edificio {

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
 private String codigo;
     public ArrayList<miliciapadre> miliciasa;
    public ArrayList<VehiculoPadre> vehiculosa;
    public EdificioRecurso3(EdificioBuilder builder) {
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
   this.codigo=builder.codigo;
      miliciasa=new ArrayList<>();
        vehiculosa=new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabjando) {
        this.trabajando = trabjando;
    }
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isDisponiblilidad() {
        return disponiblilidad;
    }

    public void setDisponiblilidad(boolean disponiblilidad) {
        this.disponiblilidad = disponiblilidad;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public int getPrecio1() {
        return Precio1;
    }

    public void setPrecio1(int Precio1) {
        this.Precio1 = Precio1;
    }

    public int getPrecio2() {
        return Precio2;
    }

    public void setPrecio2(int Precio2) {
        this.Precio2 = Precio2;
    }

    public int getPrecio3() {
        return Precio3;
    }

    public void setPrecio3(int Precio3) {
        this.Precio3 = Precio3;
    }

    public int getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(int Trabajo) {
        this.Trabajo = Trabajo;
    }

    public int getConstruccion() {
        return Construccion;
    }

    public void setConstruccion(int Construccion) {
        this.Construccion = Construccion;
    }

    public int getAcumt() {
        return acumt;
    }

    public void setAcumt(int acumt) {
        this.acumt = acumt;
    }

    public int getAcumc() {
        return acumc;
    }

    public void setAcumc(int acumc) {
        this.acumc = acumc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     @Override
    public recurso getrecursos(String raza){
        return Factoryrecursos.getRecurso("RECURSO3", raza, 100);
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
 private String codigo;
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
        public EdificioBuilder codigo(String codigo) {
            this.codigo = codigo;
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

        public EdificioRecurso3 build() {
            return new EdificioRecurso3(this);
        }

    }
}

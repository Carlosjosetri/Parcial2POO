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
public class MiliciaEspecial implements miliciapadre {

    private String nombre;
    private int ataque;
    private int vida;
    public boolean entrenado;

    public MiliciaEspecial(RecursoBuilder builder) {
        this.nombre = builder.nombre;
        this.ataque = builder.ataque;
        this.vida = builder.vida;
        this.entrenado = false;
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
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

    public static class RecursoBuilder {

        private String nombre;
        private int ataque;
        private int vida;

        public RecursoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public RecursoBuilder ataque(int ataque) {
            this.ataque = ataque;
            return this;
        }

        public RecursoBuilder vida(int vida) {
            this.vida = vida;
            return this;
        }

        public MiliciaEspecial build() {
            return new MiliciaEspecial(this);
        }
    }

    
}

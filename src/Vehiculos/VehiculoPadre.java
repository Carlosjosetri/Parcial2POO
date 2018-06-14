/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Milicias.*;

/**
 *
 * @author UCA
 */
public interface VehiculoPadre {
   public void setataque(int ataque);
    public String getNombre();
    public void setNombre(String nombre);
    public int getataque();
  public void setVida(int vida);
  public int getVida();
 
 
}

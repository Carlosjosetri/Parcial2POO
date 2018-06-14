/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicias;

/**
 *
 * @author UCA
 */
public interface miliciapadre {

      public void setataque(int ataque);
    public String getNombre();
    public void setNombre(String nombre);
    public int getataque();
  public void setVida(int vida);
  public int getVida();
   public boolean isEntrenado();

    public void setEntrenado(boolean entrenado);
   
}

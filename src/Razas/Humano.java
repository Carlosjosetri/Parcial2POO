/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;
import Edificio.Edificio;
import Edificio.EdificioFactory;
/**
 *
 * @author CARLOS
 */
public class Humano extends Raza{
      public String Nombre="HUMANO";
      public Edificio centro;
    @Override
    public void ConstructorCentrodeMando(){
         
         
        
     }
      @Override
    public void setnombre(){
        Nombre="HUMANO";
    }
    @Override
    public Edificio ConstruirEdificacion(String edificio){
        return EdificioFactory.getEdificio("HUMANO",edificio);
            
        
    }
   
}

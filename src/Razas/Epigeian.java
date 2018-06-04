/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Edificio.Edificio;

/**
 *
 * @author CARLOS
 */
public class Epigeian implements Raza{
    CentrodeMando Centro; 
    @Override
    public void ConstructorCentrodeMando(){
         CentrodeMando centro= new CentrodeMando();
         centro.nivel=1;
         centro.setVida(3000);
           centro.setRecurso1(1000);
         centro.setRecurso2(500);
         centro.setRecurso3(300);
     }
      @Override
    public Edificio ConstruirEdificacion(String edificio){
        return null;
    }
       
}

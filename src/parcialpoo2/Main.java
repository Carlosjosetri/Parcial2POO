/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Edificio.Edificio;
import Edificio.EdificioFactory;



/**
 *
 * @author CARLOS
 */
public class Main {
     public static void main(String[] args){
    Edificio temporal =EdificioFactory.getEdificio("DRAIOCHT","ENTRENAMIENTO" );
         System.out.println(temporal.getPrecio1());
        Menu menu = Menu.getInstance();
         
        
        menu.opcionesiniciales();
      
         
         
     } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Edificio.Edificio;

import Edificio.EdificioVehiculo2;



/**
 *
 * @author CARLOS
 */
public class FactoryVehiculo2 {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioVehiculo2.EdificioBuilder().nombre("Edificio de Entrenamiento ").Precio1(400).Precio2(200).Precio3(0)
                        .vida(2000).Trabajo(1).Construccion(1).disponible("En construccion").disponiblilidad(false).build();
            case "HUMANO":
               return new EdificioVehiculo2.EdificioBuilder().nombre("Edificio de Entrenamiento ").Precio1(300).Precio2(200).Precio3(0)
                        .vida(1800).Trabajo(1).Construccion(2).disponible("En construccion").disponiblilidad(false).build();
            case "EPIGEIAN":
                return new EdificioVehiculo2.EdificioBuilder().nombre("Edificio de Entrenamiento ").Precio1(500).Precio2(300).Precio3(0)
                        .vida(5000).Trabajo(2).Construccion(2).disponible("En construccion").disponiblilidad(false).build();
     
            
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Edificio.Edificio;

import Edificio.EdificioMiliciaEspecial;



/**
 *
 * @author CARLOS
 */
public class FactoryMiliciaEspecial {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioMiliciaEspecial.EdificioBuilder().nombre("Edificio de Milicia Especial DRAIOCHT").Precio1(800).Precio2(200).Precio3(100)
                        .vida(2000).Trabajo(1).Construccion(1).disponible("En construccion").disponiblilidad(false).build();
            case "HUMANO":
               return new EdificioMiliciaEspecial.EdificioBuilder().nombre("Edificio de Milicia Especial HUMANO").Precio1(800).Precio2(200).Precio3(100)
                        .vida(1800).Trabajo(1).Construccion(2).disponible("En construccion").disponiblilidad(false).build();
            case "EPIGEIAN":
                return new EdificioMiliciaEspecial.EdificioBuilder().nombre("Edificio de Milicia Especial EPIGEIAN").Precio1(1000).Precio2(300).Precio3(200)
                        .vida(5000).Trabajo(2).Construccion(2).disponible("En construccion").disponiblilidad(false).build();
     
            
        }
        return null;
    }
}

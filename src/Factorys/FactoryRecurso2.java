/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Edificio.Edificio;

import Edificio.EdificioRecurso2;
import recursos.Factoryrecursos;
import recursos.recurso;



/**
 *
 * @author CARLOS
 */
public class FactoryRecurso2 {
    public static Edificio getEdificio(String tipo) {
         recurso temp=Factoryrecursos.getRecurso("RECURSO1", tipo, 0);
        String prueba=temp.getNombre();
            temp=null;
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioRecurso2.EdificioBuilder().nombre("Edificio de Recolector de "+prueba).Precio1(400).Precio2(200).Precio3(100)
                        .vida(2000).Trabajo(1).Construccion(1).disponible("En construccion").disponiblilidad(false).codigo("C1U2B3O4").build();
            case "HUMANO":
               return new EdificioRecurso2.EdificioBuilder().nombre("Edificio de Recolector de "+prueba).Precio1(300).Precio2(200).Precio3(100)
                        .vida(1800).Trabajo(1).Construccion(2).disponible("En construccion").disponiblilidad(false).codigo("C1U2B3O4").build();
            case "EPIGEIAN":
                return new EdificioRecurso2.EdificioBuilder().nombre("Edificio de Recolector de "+prueba).Precio1(500).Precio2(300).Precio3(100)
                        .vida(5000).Trabajo(2).Construccion(2).disponible("En construccion").disponiblilidad(false).codigo("C1U2B3O4").build();
     
            
        }
        return null;
    }
}

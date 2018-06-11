/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Edificio.Edificio;
import Edificio.EdificioEntrenamiento;



/**
 *
 * @author CARLOS
 */
public class FactoryEntrenamiento {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioEntrenamiento.EdificioBuilder().vida(800)
                        .nombre("Entrenamiento DRAIOCHT").build();
            case "HUMANO":
                return new EdificioEntrenamiento.EdificioBuilder().vida(700)
                        .nombre("Entrenamiento HUMANO").build();
            case "EPIGEIAN":
                return new EdificioEntrenamiento.EdificioBuilder().vida(21000)
                        .nombre("Entrenamiento EPIGEIAN").build();
     
            
        }
        return null;
    }
}

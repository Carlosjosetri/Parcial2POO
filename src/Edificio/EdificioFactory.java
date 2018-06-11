/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;
import Factorys.FactoryCENTRO;
import Factorys.FactoryEntrenamiento;
import Factorys.FactoryRecurso1;


/**
 *
 * @author CARLOS
 */
public class EdificioFactory {
    public static Edificio getEdificio(String tipo,String opcion) {
        switch (opcion) {
            case "RECURSO1":
                return FactoryRecurso1.getEdificio(tipo);
            case "CENTROMANDO":
                return FactoryCENTRO.getEdificio(tipo);
            case "ENTRENAMIENTO":
                return FactoryEntrenamiento.getEdificio(tipo);
     
            
        }
        return null;
    }
}

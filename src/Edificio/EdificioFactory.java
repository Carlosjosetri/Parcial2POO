/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;
import Factorys.FactoryCENTRO;
import Factorys.FactoryEntrenamiento;
import Factorys.FactoryMilicia;
import Factorys.FactoryMiliciaEspecial;
import Factorys.FactoryRecurso1;
import Factorys.FactoryRecurso2;
import Factorys.FactoryRecurso3;
import Factorys.FactoryVehiculo;
import Factorys.FactoryVehiculo2;


/**
 *
 * @author CARLOS
 */
public class EdificioFactory {
    public static Edificio getEdificio(String tipo,String opcion) {
        switch (opcion) {
            
            case "CENTROMANDO":
                return FactoryCENTRO.getEdificio(tipo);
            case "ENTRENAMIENTO":
                return FactoryEntrenamiento.getEdificio(tipo);
            case "MILICIA":
                return FactoryMilicia.getEdificio(tipo);
            case "MILICIAE":
                return FactoryMiliciaEspecial.getEdificio(tipo);
            case "VEHICULO":
                return FactoryVehiculo.getEdificio(tipo);
            case "VEHICULO2":
                return FactoryVehiculo2.getEdificio(tipo);
            case "RECURSO1":
                return FactoryRecurso1.getEdificio(tipo);
            case "RECURSO2":
                return FactoryRecurso2.getEdificio(tipo);
            case "RECURSO3":
                return FactoryRecurso3.getEdificio(tipo);
            
            
        }
        return null;
    }
}

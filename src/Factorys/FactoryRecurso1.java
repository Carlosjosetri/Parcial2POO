/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;
import Edificio.Edificio;
import Edificio.EdificioRecurso1;
/**
 *
 * @author CARLOS
 */
public class FactoryRecurso1 {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioRecurso1.EdificioBuilder().vida(2100).construccion(1).trabajo(1).
                        cantidadProducida(200).acum(0).build() ;
            case "HUMANO":
                return new EdificioRecurso1.EdificioBuilder().vida(1000).construccion(1).trabajo(2).
                        cantidadProducida(400).acum(0).build() ;
            case "EPIGEIAN":
                return new EdificioRecurso1.EdificioBuilder().vida(4000) .construccion(2).trabajo(3).
                        cantidadProducida(800).acum(0).build() ;
         
     
            
        }
        return null;
    }
}

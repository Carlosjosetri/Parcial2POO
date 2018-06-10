/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;
import Edificio.CentrodeMando;
import Edificio.Edificio;



/**
 *
 * @author CARLOS
 */
public class FactoryCENTRO {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new CentrodeMando.EdificioBuilder().vida(1000).build() ;
            case "HUMANO":
                return new CentrodeMando.EdificioBuilder().vida(1200).build() ;
            case "EPIGEIAN":
                return new CentrodeMando.EdificioBuilder().vida(3000).build() ;
     
            
        }
        return null;
    }
}

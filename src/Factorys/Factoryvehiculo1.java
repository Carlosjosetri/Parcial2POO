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
public class Factoryvehiculo1 {
    public static Edificio getEdificio(String tipo) {
        switch (tipo) {
            case "DRAIOCHT":
                return new EdificioRecurso1.EdificioBuilder().vida(2100).build() ;
     
            
        }
        return null;
    }
}

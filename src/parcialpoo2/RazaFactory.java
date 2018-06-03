/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;
import Razas.Draiocht;
import Razas.Epigeian;
import Razas.Humano;
import Razas.Ogro;
import Razas.Dylan;
import Razas.Raza;
/**
 *
 * @author CARLOS
 */
public class RazaFactory {
     public static Raza getRaza(String opcion) {
        switch (opcion) {
            case "HUMANO":
                return new Humano();
            case "EPIGEIA":
                return new Epigeian();
            case "DRAIOCHT":
                return new Draiocht();
            case "DYlAN":
                return new Dylan();
            case "OGRO":
                return new Ogro();
            
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Milicias.*;



/**
 *
 * @author CARLOS
 */
public class Factoryvehiculos {
       public static VehiculoPadre getVehiculo(String tipo,String Raza) {
        switch (Raza) {
            case "DRAIOCHT":
                switch (tipo){
                    case "VEHICULO":
                        return new Vehiculo1.RecursoBuilder().nombre("Caballo").vida(700).ataque(1100).build() ;
                    case "VEHICULO2":
                        return new Vehiculo2.RecursoBuilder().nombre("Dragon").vida(6000).ataque(2000).build() ;
               
                }
            case "HUMANO":
                   switch (tipo){
                    case "VEHICULO":
                        return new Vehiculo1.RecursoBuilder().nombre("Caballo").vida(700).ataque(1000).build() ;
                    case "VEHICULO2":
                        return new Vehiculo2.RecursoBuilder().nombre("44").vida(4000).ataque(2200).build() ;
           
                }
            case "EPIGEIAN":
                   switch (tipo){
                    case "VEHICULO":
                        return new Vehiculo1.RecursoBuilder().nombre("Roca").vida(3000).ataque(200).build() ;
                    case "VEHICULO2":
                        return new Vehiculo2.RecursoBuilder().nombre("Roca Magnetica").vida(4000).ataque(500).build() ;
            
                }
     
            
        }
        return null;
}
}
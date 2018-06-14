/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicias;



/**
 *
 * @author CARLOS
 */
public class FactoryMiliciaa {
       public static miliciapadre getMilicia(String tipo,String Raza) {
        switch (Raza) {
            case "DRAIOCHT":
                switch (tipo){
                    case "MILICIA":
                        return new Milicia.RecursoBuilder().nombre("Mago rojo").vida(700).ataque(700).build() ;
                    case "MILICIAESPECIAL":
                        return new Miliciaespecial.RecursoBuilder().nombre("Gandalf").vida(2000).ataque(1000).build() ;
               
                }
            case "HUMANO":
                   switch (tipo){
                    case "MILICIA":
                        return new Milicia.RecursoBuilder().nombre("Ejercito URSS").vida(2000).ataque(400).build() ;
                    case "MILICIAESPECIAL":
                        return new Miliciaespecial.RecursoBuilder().nombre("Putin").vida(3000).ataque(1200).build() ;
           
                }
            case "EPIGEIAN":
                   switch (tipo){
                    case "MILICIA":
                        return new Milicia.RecursoBuilder().nombre("Monolitos").vida(3000).ataque(200).build() ;
                    case "MILICIAESPECIAL":
                        return new Miliciaespecial.RecursoBuilder().nombre("Golem").vida(9000).ataque(500).build() ;
            
                }
     
            
        }
        return null;
}
}
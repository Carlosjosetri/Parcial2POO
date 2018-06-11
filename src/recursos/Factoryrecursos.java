/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author CARLOS
 */
public class Factoryrecursos {
       public static recurso getRecurso(String tipo,String Raza,int cant) {
        switch (Raza) {
            case "DRAIOCHT":
                switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Oro").cantidad(cant).build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("crystal").cantidad(cant).build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Mana").cantidad(cant).build() ;
                }
            case "HUMANO":
                   switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Billetes").cantidad(cant).build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("Metal").cantidad(cant).build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Electricidad").cantidad(cant).build() ;
                }
            case "EPIGEIAN":
                   switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Rocas verdes").cantidad(cant).build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("Rocas Azules").cantidad(cant).build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Magma").cantidad(cant).build() ;
                }
     
            
        }
        return null;
}
}
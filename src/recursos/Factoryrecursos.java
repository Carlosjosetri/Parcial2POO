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
       public static recurso getRecurso(String tipo,String Raza) {
        switch (Raza) {
            case "DRAIOCHT":
                switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Oro").build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("crystal").build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Mana").build() ;
                }
            case "HUMANO":
                   switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Dolares").build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("Metales").build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Electricidad").build() ;
                }
            case "EPIGEIAN":
                   switch (tipo){
                    case "RECURSO1":
                        return new Recurso1.RecursoBuilder().nombre("Rocas verdes").build() ;
                    case "RECURSO2":
                        return new Recurso1.RecursoBuilder().nombre("Rocas Azules").build() ;
                    case "RECURSO3":
                        return new Recurso1.RecursoBuilder().nombre("Lava").build() ;
                }
     
            
        }
        return null;
}
}
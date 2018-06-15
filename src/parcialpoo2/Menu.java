/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Edificio.Edificio;
import Edificio.EdificioFactory;
import Razas.Raza;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import recursos.Factoryrecursos;
import recursos.Recurso1;
import recursos.recurso;

/**
 *
 * @author CARLOS
 */
public class Menu {

    private static Menu menu;

    private Menu() {
    }

    /**
     * Para acceso global al menú. Se crea solo una instancia.
     */
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opcionesiniciales() {
        Fase fase = new Fase();

        fase.players.add(new Player());
        fase.players.add(new Player());
        System.out.println("Ingrese nombre Jugador 1");
        Scanner leer = new Scanner(System.in);
        fase.players.get(0).setNombre(leer.nextLine());
        System.out.println("Ingrese nombre Jugador 2");
        fase.players.get(1).setNombre(leer.nextLine());
        System.out.println("Elegir raza Jugador 1");
        while (fase.players.get(0).getRaza() == null) {
            getraza(fase.players.get(0));
        }

        System.out.println("Elegir raza Jugador 2");
        while (fase.players.get(1).getRaza() == null) {
            getraza(fase.players.get(1));

        }
        fase.players.get(0).edificios.add(fase.players.get(0).getRaza().
                ConstruirEdificacion("CENTROMANDO"));
        fase.players.get(1).edificios.add(fase.players.get(1).getRaza().
                ConstruirEdificacion("CENTROMANDO"));

        System.out.println(fase.players.get(0).getRaza().Nombre);

        setRecursosiniciales(fase.players.get(0));
        setRecursosiniciales(fase.players.get(1));

//        System.out.println(fase.players.get(0).edificios.get(0).recurso1.get(0).getCantidad());
        Random o = new Random();
        int n = o.nextInt(2);
        int y;
        if (n == 0) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println("QUE EMPIEZE EL JUEGO");
        while (fase.players.get(0).edificios.get(0).getVida() > 0
                || fase.players.get(1).edificios.get(0).getVida() > 0) {
            System.out.println("#########################################");
            System.out.println("Empieza fase " + fase.numfase);
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador " + (n + 1));
            System.out.println("");
            menufasefuc(fase.players.get(n),fase.players.get(y));
            usaredificio(fase.players.get(n));
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador " + (y + 1));
            System.out.println("");
            menufasefuc(fase.players.get(y),fase.players.get(n));
            fase.numfase++;
            incremento(fase);
            Trabajocont(fase);
        }

    }

    public void getraza(Player player) {
        int opcion = 5;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {

            menuraza();
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        player.setRaza(RazaFactory.getRaza("DRAIOCHT"));
                        player.getRaza().Nombre = "DRAIOCHT";
                        flag = false;
                        break;
                    case 2:
                        player.setRaza(RazaFactory.getRaza("HUMANO"));
                        player.getRaza().Nombre = "HUMANO";
                        flag = false;
                        break;
                    case 3:
                        player.setRaza(RazaFactory.getRaza("EPIGEIAN"));
                        player.getRaza().Nombre = "EPIGEIAN";
                        flag = false;
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void menufasefuc(Player player,Player player2) {
        int opcion = 5;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            System.out.println("RECURSOS DISPONIBLES||||||||");
            System.out.println("Tienes: ");

            mostrarRecursos(player);
            System.out.println("");
            opcionesMenuPrincipal();

            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        menuConstrucion(player);
                        break;
                    case 2:
                        edificiosDisponibles(player);
                        break;
                    case 3:
                        usaredificio(player);
                        break;
                    case 4:
                        edificiosDisponibles(player);
                        break;
                    case 5:
                        flag = false;
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
    public void atacarcon(Player player,Player player2){
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            System.out.println("Con que quieres atacar?");
            System.out.println("1-Milicias");
            System.out.println("2-Vehiculos");
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                       
                       
                       
                    atacarconmilicia ( player, player2);
                        flag = false;
                        break;
                    case 2:
                         atacarconVehiculos ( player, player2);
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
    public void atacarconVehiculos (Player player,Player player2){
        if(player.vehiculos.size()>=1){
            System.out.println("Tus milicias disponibles son ");
                for (int i = 0; i < player.vehiculos.size(); i++) {
            System.out.println((i+1) + "--" + player.vehiculos.get(i).getNombre() + "" + player.getRaza().Nombre);}
                 System.out.println("@@@ ELIJA EL NUMERO DE MILICIA A USAR");
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {

            try {

                opcion = leer.nextInt();
                if (opcion-1 <= player.vehiculos.size()) {
                    if(opcion!=0){
                         menudeataquev(player, opcion, player2);
                    flag = false;
                    }else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }
                   
                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }
        System.out.println("");
        }else{
            System.out.println("No tienes tropas par atacar");
        }
    }
     public void menudeataquev(Player player, int mili,Player player2) {
             System.out.println("@@@ ELIJA EL NUMERO DEL EDIFICIO A ATACAR");
               for (int i = 0; i < player2.edificios.size(); i++) {
            System.out.println((i+1) + "--" + player2.edificios.get(i).getNombre() + "" + player2.getRaza().Nombre
                    + " Estado: " + player2.edificios.get(i).getDisponible());

        }
        System.out.println("");
                int opcion2;
        boolean flag2 = true;
        Scanner leer2 = new Scanner(System.in);
        while (flag2 == true) {

            try {

                opcion2 = leer2.nextInt();
                if (opcion2-1 <= player.vehiculos.size()) {
                    
                        player2.edificios.get(opcion2).vehiculosa.add(player.vehiculos.get(mili));
                    flag2 = false;
                 
                   
                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer2.nextLine();
            }
        }
       
    }
    public void atacarconmilicia (Player player,Player player2){
        if(player.milicias.size()>=1){
            System.out.println("Tus milicias disponibles son ");
                for (int i = 0; i < player.milicias.size(); i++) {
            System.out.println((i+1) + "--" + player.milicias.get(i).getNombre() + "" + player.getRaza().Nombre);}
                 System.out.println("@@@ ELIJA EL NUMERO DE MILICIA A USAR");
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {

            try {

                opcion = leer.nextInt();
                if (opcion-1 <= player.milicias.size()) {
                    if(opcion!=0){
                         menudeataque(player, opcion, player2);
                    flag = false;
                    }else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }
                   
                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }
        System.out.println("");
        }else{
            System.out.println("No tienes tropas par atacar");
        }
    }
     public void menudeataque(Player player, int mili,Player player2) {
             System.out.println("@@@ ELIJA EL NUMERO DEL EDIFICIO A ATACAR");
               for (int i = 0; i < player2.edificios.size(); i++) {
            System.out.println((i+1) + "--" + player2.edificios.get(i).getNombre() + "" + player2.getRaza().Nombre
                    + " Estado: " + player2.edificios.get(i).getDisponible());

        }
        System.out.println("");
                int opcion2;
        boolean flag2 = true;
        Scanner leer2 = new Scanner(System.in);
        while (flag2 == true) {

            try {

                opcion2 = leer2.nextInt();
                if (opcion2-1 <= player.milicias.size()) {
                    
                        player2.edificios.get(opcion2).miliciasa.add(player.milicias.get(mili));
                    flag2 = false;
                 
                   
                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer2.nextLine();
            }
        }
       
    }

    public void menuConstrucion(Player player) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            queconstruir();
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        menuConstrucionRecursos(player);
                        break;
                    case 2:
                        menuConstrucionMilicias(player);
                        break;
                    case 3:
                        compra(player, "ENTRENAMIENTO");
                        flag = false;
                        break;
                    case 4:
                        menuConstrucionVehiculos(player);
                        flag = false;
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void menuConstrucionRecursos(Player player) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            opcionesedificiosderecurso(player);
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        compra(player, "RECURSO1");
                        flag = false;
                        break;
                    case 2:
                        compra(player, "RECURSO2");
                        flag = false;
                        break;
                    case 3:
                        compra(player, "RECURSO3");
                        flag = false;
                        break;
                    case 4:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void menuConstrucionVehiculos(Player player) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            opcionesedificiosdeVehiculo();
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        compra(player, "VEHICULO");
                        flag = false;
                        break;
                    case 2:
                        compra(player, "VEHICULO2");
                        flag = false;
                        break;
                    case 3:

                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void menuConstrucionMilicias(Player player) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            opcionesedificiosdeMilicia();
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        compra(player, "MILICIA");
                        break;
                    case 2:
                        compra(player, "MILICIAE");
                        break;
                    case 3:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void edificiosDisponibles(Player player) {

        for (int i = 1; i < player.edificios.size(); i++) {
            System.out.println((i) + "--" + player.edificios.get(i).getNombre() + "" + player.getRaza().Nombre
                    + " Estado: " + player.edificios.get(i).getDisponible());

        }
        System.out.println("");
    }

    public void usaredificio(Player player) {
        edificiosDisponibles(player);
        System.out.println("");
        System.out.println("@@@ ELIJA EL NUMERO DE EDIFICIO A USAR");
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {

            try {

                opcion = leer.nextInt();
                if (opcion <= player.edificios.size() - 1) {
                    if(opcion!=0){
                         menudeuso(player, opcion);
                    flag = false;
                    }else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }
                   
                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }
    }

    public void menudeuso(Player player, int edificioindex) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            System.out.println("Seguro quieres usar este edificio?");
            System.out.println("1-Si");
            System.out.println("2-No");
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        if(player.edificios.get(edificioindex).getCodigo()==null){
                             eleccion (player,edificioindex);
                        }else{
                            eleccioncod (player,edificioindex);
                        }
                       
                       
                    
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
    
   public void eleccion (Player player,int edi){
       switch(player.edificios.get(edi).getNombre()){
           case "Edificio de Entrenamiento ":
               System.out.println("holii2i");
               break;
               
           case "Edificio de Milicia ":
                menucreamilicia(player,edi);
               break;
               
           case "Edificio de Milicia Especial ":
                menucreamilicia(player,edi);
               break;
                    
           case "Edificio de Creacion de Vehiculos ":
               System.out.println("holii3i");
               break;
               
           case "Edificio de Creacion de Vehiculos2 ":
               System.out.println("holii4i");
               break;
               
      
               
       }
   }
    
   public void eleccioncod (Player player,int edi){
       switch(player.edificios.get(edi).getCodigo()){
           case "U1N2":
              menurecolector1(player,  edi);
               break;
               
           case "C1U2B3O4":
               menurecolector2(player,  edi);
               break;
               
           case "D1E2":
                 System.out.println("Este edificio trabaja automaticamente");
               break;
                
               
      
               
       }
   }
   
     public void menurecolector1(Player player, int edificioindex) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
          
            System.out.println("1-Recolectar recurso 1");
            System.out.println("2-Salir");
         
        
            
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                           player.edificios.get(0).recurso1.add(player.edificios.get(edificioindex).getrecursos(player.getRaza().Nombre));
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
     public void menurecolector2(Player player, int edificioindex) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
     
            System.out.println("1-Recolectar recurso 2");
            System.out.println("2-Salir");
          
            
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                         player.edificios.get(0).recurso2.add(player.edificios.get(edificioindex).getrecursos(player.getRaza().Nombre));
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
     public void menucreamilicia(Player player, int edificioindex) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
          if("M1E2".equals(player.edificios.get(edificioindex).codigo)){
            System.out.println("1-Crear Milicia");
            System.out.println("2-Salir");
          }else{
            System.out.println("1-Crear Milicia especial");
            System.out.println("2-Salir");
          }
            
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        player.milicias.add(player.edificios.get(edificioindex).CrearMilicia(player.getRaza().Nombre));
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
     public void menucrearvehiculo(Player player, int edificioindex) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
          if("M1E2".equals(player.edificios.get(edificioindex).codigo)){
            System.out.println("1-Crear Milicia");
            System.out.println("2-Salir");
          }else{
            System.out.println("1-Crear Milicia especial");
            System.out.println("2-Salir");
          }
            
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        player.vehiculos.add(player.edificios.get(edificioindex).getVehiculo(player.getRaza().Nombre));
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;

                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public void setRecursosiniciales(Player player) {
        player.edificios.get(0).recurso1 = new ArrayList<>();
        player.edificios.get(0).recurso2 = new ArrayList<>();
        player.edificios.get(0).recurso3 = new ArrayList<>();
        player.edificios.get(0).recurso1.add(Factoryrecursos.getRecurso("RECURSO1",
                player.getRaza().Nombre, 1000));
        player.edificios.get(0).recurso2.add(Factoryrecursos.getRecurso("RECURSO2",
                player.getRaza().Nombre, 500));
        player.edificios.get(0).recurso3.add(Factoryrecursos.getRecurso("RECURSO3",
                player.getRaza().Nombre, 300));

    }

    public void mostrarRecursos(Player player) {
        int acum1 = 0;
        int acum2 = 0;
        int acum3 = 0;
        for (int i = 0; i < player.edificios.get(0).recurso1.size(); i++) {
            acum1 = acum1 + player.edificios.get(0).recurso1.get(i).getCantidad();

        }
        for (int i = 0; i < player.edificios.get(0).recurso2.size(); i++) {
            acum2 = acum2 + player.edificios.get(0).recurso2.get(i).getCantidad();

        }
        for (int i = 0; i < player.edificios.get(0).recurso3.size(); i++) {
            acum3 = acum3 + player.edificios.get(0).recurso3.get(i).getCantidad();

        }
        System.out.println(acum1 + " de " + Factoryrecursos.getRecurso("RECURSO1",
                player.getRaza().Nombre, 0).getNombre());
        System.out.println(acum2 + " de " + Factoryrecursos.getRecurso("RECURSO2",
                player.getRaza().Nombre, 0).getNombre());
        System.out.println(acum3 + " de " + Factoryrecursos.getRecurso("RECURSO3",
                player.getRaza().Nombre, 0).getNombre());

    }

    public void compra(Player player, String Edificio) {
        Edificio temporal = EdificioFactory.getEdificio(player.getRaza().Nombre, Edificio);

        int acum1 = 0;
        int acum2 = 0;
        int acum3 = 0;
        int temp1 = temporal.getPrecio1();
        int temp2 = temporal.getPrecio2();
        int temp3 = temporal.getPrecio3();
        for (int i = 0; i < player.edificios.get(0).recurso1.size(); i++) {
            acum1 = acum1 + player.edificios.get(0).recurso1.get(i).getCantidad();

        }
        for (int i = 0; i < player.edificios.get(0).recurso2.size(); i++) {
            acum2 = acum2 + player.edificios.get(0).recurso2.get(i).getCantidad();

        }
        for (int i = 0; i < player.edificios.get(0).recurso3.size(); i++) {
            acum3 = acum3 + player.edificios.get(0).recurso3.get(i).getCantidad();

        }
        if (temporal.getPrecio1() < acum1 && temporal.getPrecio2() < acum2 && temporal.getPrecio3() < acum3) {
            for (int i = 0; i < player.edificios.get(0).recurso1.size(); i++) {
                acum1 = player.edificios.get(0).recurso1.get(i).getCantidad();
                if (acum1 > temp1) {
                    player.edificios.get(0).recurso1.get(i)
                            .setCantidad(player.edificios.get(0).recurso1.get(i).getCantidad() - temp1);
                    break;
                } else {
                    acum1 = temp1 - acum1;
                    player.edificios.get(0).recurso1.get(i)
                            .setCantidad(player.edificios.get(0).recurso1.get(i).getCantidad() - temp1);
                }

            }
            for (int i = 0; i < player.edificios.get(0).recurso2.size(); i++) {
                acum1 = player.edificios.get(0).recurso2.get(i).getCantidad();
                if (acum2 > temp2) {
                    player.edificios.get(0).recurso2.get(i)
                            .setCantidad(player.edificios.get(0).recurso2.get(i).getCantidad() - temp2);
                    break;
                } else {
                    acum1 = temp2 - acum2;
                    player.edificios.get(0).recurso2.get(i)
                            .setCantidad(player.edificios.get(0).recurso2.get(i).getCantidad() - temp2);
                }

            }
            for (int i = 0; i < player.edificios.get(0).recurso3.size(); i++) {
                acum1 = player.edificios.get(0).recurso3.get(i).getCantidad();
                if (acum3 > temp3) {
                    player.edificios.get(0).recurso3.get(i)
                            .setCantidad(player.edificios.get(0).recurso3.get(i).getCantidad() - temp3);
                    break;
                } else {
                    acum3 = temp3 - acum3;
                    player.edificios.get(0).recurso3.get(i)
                            .setCantidad(player.edificios.get(0).recurso3.get(i).getCantidad() - temp3);
                }

            }

            player.edificios.add(player.getRaza().ConstruirEdificacion(Edificio));
        } else {
            System.out.println("################################");
            System.out.println("###NO HAY RECURSOS SUFICIENTES###");
            System.out.println("#################################");
            System.out.println("");
        }
        temporal = null;
    }

    public void Trabajocont(Fase fase) {
        for (int i = 0; i < fase.players.size(); i++) {
            for (int j = 1; j < fase.players.get(i).edificios.size(); j++) {
               
                if (fase.players.get(i).edificios.get(j).isDisponiblilidad()) {
                    if (fase.players.get(i).edificios.get(j).isTrabajando()) {

                    } else {
                        fase.players.get(i).edificios.get(j).
                                setAcumt(fase.players.get(i).edificios.get(j).getAcumt() + 1);
                    }
                }

            }

        }
    }
    public void Trabajo(Fase fase) {
        for (int i = 0; i < fase.players.size(); i++) {
            for (int j = 1; j < fase.players.get(i).edificios.size(); j++) {
               
                if (fase.players.get(i).edificios.get(j).isDisponiblilidad()) {
                    if (fase.players.get(i).edificios.get(j).isTrabajando()) {

                    } else {
                        fase.players.get(i).edificios.get(j).
                                setAcumt(fase.players.get(i).edificios.get(j).getAcumt() + 1);
                    }
                }

            }

        }
    }

    public void incremento(Fase fase) {
        for (int i = 0; i < fase.players.size(); i++) {
            
            for (int j = 1; j < fase.players.get(i).edificios.size() - 1; j++) {
             
                if (fase.players.get(i).edificios.get(j).getAcumc() == fase.players.get(i).edificios.get(j).getConstruccion()) {
                
                    fase.players.get(i).edificios.get(j).setDisponiblilidad(true);
                    fase.players.get(i).edificios.get(j).setDisponible("En funcionamiento");
                } else {
                  
                    fase.players.get(i).edificios.get(j).
                            setAcumc(fase.players.get(i).edificios.get(j).getAcumc() + 1);
                }

            }

        }

    }

    public void menuraza() {
        System.out.println("Precione 1 para DRAIOCHT");
        System.out.println("Precione 2 para HUMANO");
        System.out.println("Precione 3 para EPIGEIAN");

    }

    public void opcionesMenuPrincipal() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios.");
        System.out.println("2. Ver Edificios disponibles ");
        System.out.println("3. Usar Edificios");
        System.out.println("4. Atacar");
        
        System.out.println("5. Pasar de turno.");

    }

    public void queconstruir() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios de Recoleccion.");
        System.out.println("2. Construir Edificios para crear miliacia.");
        System.out.println("3. Construir Edificio Entrenar milicia.");
        System.out.println("4. Construir Edificios para crear veiculos.");
        System.out.println("5. salir");

    }

    public void opcionesedificiosderecurso(Player player) {
        recurso temp = Factoryrecursos.getRecurso("RECURSO1", player.getRaza().Nombre, 0);
        recurso temp2 = Factoryrecursos.getRecurso("RECURSO2", player.getRaza().Nombre, 0);
        recurso temp3 = Factoryrecursos.getRecurso("RECURSO3", player.getRaza().Nombre, 0);
        String prueba = temp.getNombre();
        String prueba2 = temp2.getNombre();
        String prueba3 = temp3.getNombre();
        temp = null;
        temp2 = null;
        temp3 = null;
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios recolector de " + prueba);
        System.out.println("2. Construir Edificios recolector de " + prueba2);
        System.out.println("3. Construir Edificios generador de " + prueba3);
        System.out.println("4. salir");
    }

    public void opcionesedificiosdeMilicia() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios productor de Milicia");
        System.out.println("2. Construir Edificios productor de Milica Especial");
        System.out.println("3. salir");
    }

    public void opcionesedificiosdeVehiculo() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios productor de Vehiculo");
        System.out.println("2. Construir Edificios productor de Vehiculo 2");
        System.out.println("3. salir");
    }

}

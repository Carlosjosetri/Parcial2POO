/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Razas.Raza;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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
            fase.players.get(0).setRaza(getraza());
        }

        System.out.println("Elegir raza Jugador 2");
        while (fase.players.get(1).getRaza() == null) {
            fase.players.get(1).setRaza(getraza());
            System.out.println("holuu");
        }
        fase.players.get(0).edificios.add(fase.players.get(0).getRaza().
                ConstruirEdificacion("CENTROMANDO"));
        fase.players.get(1).edificios.add(fase.players.get(1).getRaza().
                ConstruirEdificacion("CENTROMANDO"));
        
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
            System.out.println("Empieza fase "+fase.numfase);
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador"+(n+1));
            menufasefuc(fase.players.get(n));
             System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador"+(y+1));
            menufasefuc(fase.players.get(y));
            fase.numfase++;
           
        }

    }

    public Raza getraza() {
        int opcion = 5;
        Scanner leer = new Scanner(System.in);
        while (opcion != 4) {
            menuraza();
            try {
                System.out.print("\tElección: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        return RazaFactory.getRaza("DRAIOCHT");

                    case 2:
                        return RazaFactory.getRaza("HUMANO");
                    case 3:
                        return RazaFactory.getRaza("EPIGEIA");
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }
return null;
    }

    public void menufasefuc(Player player) {
        int opcion =5;
        boolean flag=true;
        Scanner leer = new Scanner(System.in);
        while (flag==true) {
            opcionesMenuPrincipal();
            try {
                System.out.print("\tElección: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        menuConstrucion(player);
                        break;
                    case 2:
                        edificiosDisponibles( player);
                        break;
                    case 3:
                        flag=false;
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
    public void menuConstrucion(Player player) {
        int opcion ;
        boolean flag=true;
        Scanner leer = new Scanner(System.in);
        while (flag==true) {
            queconstruir();
            try {
                System.out.print("\tElección: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        player.lag=2;
                        break;
                    case 2:
                        edificiosDisponibles( player);
                        break;
                    case 3:
                        player.edificios.add(player.getRaza().ConstruirEdificacion("ENTRENAMIENTO"));
                        flag=false;
                        break;
                    case 4:
                        flag=false;
                        break;
                    case 5:
                        flag=false;
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
  public void edificiosDisponibles(Player player){
      for(int i=0;i<player.edificios.size();i++){
          System.out.println(player.edificios.get(i).getNombre());
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
        System.out.println("2. Ver dificios disponibles para acciones.");
        System.out.println("3. Pasar de turno.");
    }
  public void queconstruir() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios de Recoleccion.");
        System.out.println("2. Construir Edificios para crear miliacia.");
        System.out.println("3. Construir Edificio Entrenar milicia.");
        System.out.println("4. Construir Edificios para crear veiculos.");
        System.out.println("5. salir");
    }
    public void opcionesedificiosderecurso() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios recolector recursos 1");
        System.out.println("2. Construir Edificios recolector recursos 2.");
        System.out.println("3. Construir Edificios generador recursos 3");
    }
   
}

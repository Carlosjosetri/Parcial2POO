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
        Player player1 = new Player();
        Player player2 = new Player();
        fase.players.add(player1);
        fase.players.add(player2);
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
            System.out.println("Empieza fase "+fase.numfase);
            System.out.println("Turno de jugador"+n+1);
            menufasefuc(fase.players.get(n));
            
           
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
                        player.lag=2;
                        break;
                    case 2:
                        System.out.println("hsdcsddc");
                        break;
                    case 3:
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

   
}

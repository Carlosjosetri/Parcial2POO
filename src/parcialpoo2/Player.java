/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Edificio.Edificio;
import Milicias.miliciapadre;
import Razas.Raza;
import Vehiculos.VehiculoPadre;
import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class Player {
    private String Nombre;
    public ArrayList<Edificio> edificios;
    public ArrayList<miliciapadre> milicias;
    public ArrayList<VehiculoPadre> vehiculos;
    private Raza raza;
    

    
public Player() {
    edificios = new ArrayList<>();
    milicias = new ArrayList<>();
   vehiculos = new ArrayList<>();
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    
}

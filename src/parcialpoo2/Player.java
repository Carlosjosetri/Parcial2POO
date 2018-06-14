/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Edificio.Edificio;
import Razas.Raza;
import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class Player {
    private String Nombre;
    public ArrayList<Edificio> edificios;
    private Raza raza;
    

    
public Player() {
    edificios = new ArrayList<>();
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

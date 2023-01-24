/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<>();

    public Baraja() {
    }
    
    public Baraja(ArrayList<Carta> mazo){
        this.mazo = mazo;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }    
}

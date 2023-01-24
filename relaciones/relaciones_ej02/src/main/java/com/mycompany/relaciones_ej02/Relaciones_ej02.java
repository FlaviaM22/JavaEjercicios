/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.relaciones_ej02;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Relaciones_ej02 {

    public static void main(String[] args) {
        RevolverDeAgua r = new RevolverDeAgua();
      
        Juego juego = new Juego();

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        r.llenarRevolver();
        System.out.println(r.toString());
        System.out.println("------------------------------");
        System.out.println("----Bienvenido a la RULETA----");
        juego.llenarJuego(listaJugadores, r);
        juego.ronda();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relaciones_ej03;

import entidades.Baraja;

import servicios.BarajaService;

/**
 *
 * @author Byte Shop
 */
public class Relaciones_ej03 {

    public static void main(String[] args) {
        
        BarajaService servicios = new BarajaService();
        Baraja baraja = servicios.crearBaraja();
        servicios.menu(baraja);         
    }
}

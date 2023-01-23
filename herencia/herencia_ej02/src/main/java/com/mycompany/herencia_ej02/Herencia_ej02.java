

package com.mycompany.herencia_ej02;


import entidades.Lavadora;
import entidades.Televisor;

/**
 *
 * @author Byte Shop
 */
public class Herencia_ej02 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
    }
}

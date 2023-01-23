/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.herencia_extra_ej02;

import entidades.*;
import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Herencia_extra_ej02 {

    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        System.out.println("---BIENVENIDOS A VENTUS CONSTRUCCIONES---");
        System.out.println("         ---POLIDEPORTIVOS---            ");
        int cont = 0;
        do {
            Polideportivo poli = new Polideportivo();
            poli.crearPoliderpotivo();
            System.out.println(" ");
            listaEdificios.add(poli);
            cont++;
        } while (cont < 2);

        System.out.println("        ---EDIFICIOS DE OFICINAS---       ");
        int cont2 = 0;
        do {
            EdificioDeOficinas edificio = new EdificioDeOficinas();
            edificio.crearEdificio();
            System.out.println(" ");
            listaEdificios.add(edificio);
            cont2++;
        } while (cont2 < 2);

        int polisAbiertos = 0;
        int polisCerrados = 0;
        System.out.println("---CARACTERÍSTICAS DE LAS CONSTRUCCIONES---");
        System.out.println(" ");
        for (Edificio aux : listaEdificios) {
            if (aux instanceof Polideportivo) {
                //Polideportivo object = (Polideportivo) aux;
                System.out.println("La superficie del polideportivo " + ((Polideportivo) aux).getNombre() + " es de " + aux.calcularSuperficie());
                System.out.println("y su volumen es de " + aux.calcularVolumen());
                System.out.println(" ");
                if (((Polideportivo) aux).isAbierto()) {
                    polisAbiertos++;
                } else {
                    polisCerrados++;
                }
            }

            if (aux instanceof EdificioDeOficinas) {
                //EdificioDeOficinas object = (EdificioDeOficinas) aux;
                System.out.println("La superficie del edificio es de " + aux.calcularSuperficie());
                System.out.println("y su volumen es de " + aux.calcularVolumen());
                System.out.println(((EdificioDeOficinas) aux).calcularPersonas());
            }
        }
        System.out.println("En total hay " + polisAbiertos + " polideportivo(s) abierto(s)\n"
                + " y " + polisCerrados + " polideportivo(s) techado(s)");
    }
}

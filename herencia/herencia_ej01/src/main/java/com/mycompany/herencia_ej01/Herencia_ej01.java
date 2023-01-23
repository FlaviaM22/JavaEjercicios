/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia_ej01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author Byte Shop
 */
public class Herencia_ej01 {

    public static void main(String[] args) {
       Animal perro1 = new Perro("Pepe", "alimento balanceado", 3, "BullDog");
       perro1.alimentar();  
       
       Animal gato1 = new Gato("Mora", "pescado", 2, "Callejera");
       gato1.alimentar();
       
       Animal caballo1 = new Caballo("Juancho", "pasto", 5, "Mestizo");
       caballo1.alimentar();  
    }
}

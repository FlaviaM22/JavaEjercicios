/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.excepciones_ej08;

import static entidades.ClassDos.metodo2;
import static entidades.ClassTres.metodo3;
import static entidades.ClassUno.metodo1;

/**
 *
 * @author Byte Shop
 */
public class Excepciones_ej08 {

    public static void main(String[] args) {
        //classUno
        try {
            System.out.println(metodo1());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ") ;
            e.printStackTrace();
        }

        //classDos
        try {
            System.out.println(metodo2());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo()") ;
            e.printStackTrace();
        }

        //classTres
        try {
            System.out.println(metodo3());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() " ) ;
        e.printStackTrace();
        }
    }
}

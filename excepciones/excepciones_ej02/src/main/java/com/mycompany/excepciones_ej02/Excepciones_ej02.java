/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango).
 */
package com.mycompany.excepciones_ej02;

import entidades.NewClass;
import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Excepciones_ej02 {

    public static void main(String[] args) {
        NewClass lista = new NewClass();

        ArrayList<String> lista1 = new ArrayList();
        lista1.add("a");
        lista1.add("b");
        lista1.add("c");

        lista.setListaLetras(lista1);
        
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(lista1.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fuera de rango");   
        }
    }
}

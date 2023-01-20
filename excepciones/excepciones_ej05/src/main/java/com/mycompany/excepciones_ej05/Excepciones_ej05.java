/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento
 */
package com.mycompany.excepciones_ej05;

import entidades.NumeroSecreto;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class Excepciones_ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NumeroSecreto numS = new NumeroSecreto();
        
        //System.out.println("El número es " + numS.getNumSecreto());
        int numUsuario;
        int cont = 1;
        boolean continua;
        System.out.println("Adivine el número secreto entre 0 y 500");
        do {
            try {
                continua = false;
                numUsuario = leer.nextInt();

                while (numS.getNumSecreto() != numUsuario) {
                    cont++;
                    if (numUsuario < numS.getNumSecreto()) {
                        System.out.println("Número incorrecto, ingrese un número mayor");
                        numUsuario = leer.nextInt();
                    } else {
                        System.out.println("Número incorrecto, ingrese un número menor");
                        numUsuario = leer.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                cont++;
                System.out.println("Tipo de dato incorrecto, por favor, ingrese un número");
                leer.nextLine();
                continua = true;
            }
        } while (continua);

        System.out.println("¡Correcto! Usted ha acertado en " + cont + " intento(s)");
    }
}

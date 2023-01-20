/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.excepciones_ej03Y_ej04;

import entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * EJERCICIO 04 Todas estas operaciones pueden tirar excepciones a manejar, el
 * ingreso por teclado puede causar una excepción de tipo
 * InputMismatchException, el método Integer.parseInt() si la cadena no puede
 * convertirse a entero, arroja una NumberFormatException y además, al dividir
 * un número por cero surge una ArithmeticException. Manipule todas las posibles
 * excepciones utilizando bloques try/catch para las distintas excepciones
 */
public class Excepciones_ej03Y_ej04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dNum = new DivisionNumero();

        System.out.print("Ingrese el primer número: ");
        String letra1 = leer.next();
        System.out.print("Ingrese el segundo número: ");
        String letra2 = leer.next();

        try {
            int num1 = Integer.parseInt(letra1);
            int num2 = Integer.parseInt(letra2);

            dNum.setNum1(num1);
            dNum.setNum2(num2);

            int division = num1 / num2;
            System.out.println("La división de ambos números es: " + division);
        } catch (InputMismatchException e) {
            //System.out.println(e.getMessage());
            System.out.println("Error, dato ingresado no válido");
        } catch (NumberFormatException e) {
            System.out.println("Una cadena no puede convertirse a número");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
 }

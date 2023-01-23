/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

package com.mycompany.herencia_ej04;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Byte Shop
 */
public class Herencia_ej04 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2, 4);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        Rectangulo rectangulo1 = new Rectangulo(6, 4);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        
    }
}

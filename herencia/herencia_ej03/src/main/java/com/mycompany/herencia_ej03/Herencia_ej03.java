/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor
 */
package com.mycompany.herencia_ej03;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Herencia_ej03 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora(20, 1000d, "negro", 'c', 50);
        listaElectrodomesticos.add(lavadora1);
        Lavadora lavadora2 = new Lavadora(50, 1000d, "gris", 'b', 70);
        listaElectrodomesticos.add(lavadora2);

        Televisor televisor1 = new Televisor(1000d, "blanco", 'f', 20);
        listaElectrodomesticos.add(televisor1);
        Televisor televisor2 = new Televisor(1000d, "azul", 'd', 90);
        listaElectrodomesticos.add(televisor2);
        
        int contL = 0;
        int contT = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;
        
        for (Electrodomestico aux : listaElectrodomesticos) {
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                aux.precioFinal();
                contL++;
                System.out.println("El precio de la lavadora N: " + contL + " es " + aux.getPrecio());
                sumaLavadoras += aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                aux.precioFinal();
                contT++;
                System.out.println("El precio del televisor N: " + contT + " es " + aux.getPrecio());
                sumaTelevisores += aux.getPrecio();
            }
        }
        System.out.println("El monto total de todos los electrodomésticos asciende a " + (sumaLavadoras + sumaTelevisores));
    }
}

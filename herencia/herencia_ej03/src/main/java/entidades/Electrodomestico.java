/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", leer=" + leer + '}';
    }

//   Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
//objeto y no será visible.
    public char comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'a':
                this.consumoEnergetico = letra;
                break;
            case 'b':
                this.consumoEnergetico = letra;
            case 'c':
                this.consumoEnergetico = letra;
                break;
            case 'd':
                this.consumoEnergetico = letra;
                break;
            case 'e':
                this.consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = 'f';
        }

        return this.consumoEnergetico;
    }
//   Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
//minúsculas. Este método se invocará al crear el objeto y no será visible

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }

        return this.color;
    }

//   Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
//precio se le da un valor base de $1000
    public void crearElectrodomestico() {

        System.out.println("----CREAR ELECTRODOMÉSTICO----");
        this.precio = 1000;
        System.out.println("Ingrese el color");
        setColor(comprobarColor(leer.next()));
        System.out.println("Ingrese el consumo energético (Letras entre A y F)");
        setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        System.out.println("Ingrese el peso");
        this.peso = leer.nextInt();
        System.out.println("Precio " + this.precio + "\nColor " + this.color + "\nConsumo Energético " + this.consumoEnergetico + "\nPeso " + this.peso);
    }

    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'a':
                break;
            case 'b':
                this.precio += 800;
                break;
            case 'c':
                this.precio += 600;
                break;
            case 'd':
                this.precio += 500;
                break;
            case 'e':
                this.precio += 300;
                break;
            case 'f':
                this.precio += 100;
                break;
        }

        if (this.peso > 0 && this.peso < 20) {
            this.precio += 100;
        } else if (this.peso > 19 && this.peso < 50) {
            this.precio += 500;
        } else if (this.peso > 49 && this.peso < 80) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }

}

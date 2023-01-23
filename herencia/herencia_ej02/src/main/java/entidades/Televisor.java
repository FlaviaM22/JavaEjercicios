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
public class Televisor extends Electrodomestico{
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    protected int resolucion;
    protected boolean sintonizador = false;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }
   
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Por favor, ingrese la resolución del televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Por favor, ingrese 'S' si tiene sintonizador o, caso contrario, 'N'");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            this.sintonizador = true;
        }
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio += (this.precio * 0.30);
        }
        if (this.sintonizador) {
            this.precio += 500;
        }
        System.out.println("El precio del televisor es " + this.precio);
        System.out.println(" ");
    }
    
    

    
}

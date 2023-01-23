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
public class Lavadora extends Electrodomestico{
  Scanner leer = new Scanner(System.in).useDelimiter("\n");  
  protected Integer carga;

    public Lavadora() {
        //crearLavadora();
    }
    
    public Lavadora(Integer carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

public final void crearLavadora(){
    super.crearElectrodomestico();
    System.out.println("Por favor, ingrese la capacidad de carga del lavarropas");
    setCarga(leer.nextInt());
    precioFinal();
}

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.carga > 30) {
            this.precio += 500;
        }
        System.out.println("El precio de la lavadora es: " + this.precio);
        System.out.println(" ");
    }     

}

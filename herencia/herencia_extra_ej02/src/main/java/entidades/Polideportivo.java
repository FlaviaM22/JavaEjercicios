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
public class Polideportivo extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private boolean techado = false;
    private boolean abierto = false;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, boolean abierto, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
        this.abierto = abierto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    
    public void crearPoliderpotivo(){
        System.out.println("----Por favor, ingrese los datos del polideportivo----");
        System.out.print("Ancho: ");
        this.ancho = leer.nextDouble();
        System.out.print("Alto: ");
        this.alto = leer.nextDouble();
        System.out.print("Largo: ");
        this.largo = leer.nextDouble();
        System.out.print("Nombre: ");
        this.nombre = leer.next();
        int resp;
        do{
        System.out.print("Sí es techado, ingrese 1; sí es abierto, ingrese 2: ");
        resp = leer.nextInt();
        }while(resp != 1 && resp != 2);
        if (resp == 1) {
            this.techado = true;
        }else
            this.abierto = true;
    }
    
    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }
    
}

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
public class EdificioDeOficinas extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int cantDeOficinasXPiso;
    private int cantPersXOficina;
    private int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantDeOficinasXPiso, int cantPersXOficina, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantDeOficinasXPiso = cantDeOficinasXPiso;
        this.cantPersXOficina = cantPersXOficina;
        this.cantPisos = cantPisos;
    }

    public int getCantDeOficinasXPiso() {
        return cantDeOficinasXPiso;
    }

    public void setCantDeOficinas(int cantDeOficinasXPiso) {
        this.cantDeOficinasXPiso = cantDeOficinasXPiso;
    }

    public int getCantPersXOficina() {
        return cantPersXOficina;
    }

    public void setCantPersXOficina(int cantPersXOficina) {
        this.cantPersXOficina = cantPersXOficina;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    public void crearEdificio(){
        System.out.println("----Por favor, ingrese los datos del edificio----");
        System.out.print("Ancho: ");
        this.ancho = leer.nextDouble();
        System.out.print("Alto: ");
        this.alto = leer.nextDouble();
        System.out.print("Largo: ");
        this.largo = leer.nextDouble();
        System.out.print("Cantidad de oficinas por piso: ");
        this.cantDeOficinasXPiso = leer.nextInt();
        System.out.print("Cantidad de personas por oficina: ");
        this.cantPersXOficina = leer.nextInt();
        System.out.print("Cantidad de pisos: ");
        this.cantPisos = leer.nextInt();
    }

    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }

    public String calcularPersonas() {
        String cadena = "";

        cadena += "La cantidad de personas por piso es de " + this.cantPersXOficina * this.cantDeOficinasXPiso + "\n";
        cadena += "y por edfificio es de " + this.cantPersXOficina * this.cantDeOficinasXPiso * this.cantPisos + "\n";
        
        return cadena;
    }
}

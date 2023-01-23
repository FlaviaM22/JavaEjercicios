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
public class Barco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public void crearBarco() {
        
        System.out.println("----POR FAVOR, COMPLETE CON LOS DATOS DEL BARCO----");
        System.out.print("Matrícula: ");
        this.matricula = leer.next();
        System.out.print("Eslora en metros: ");
        this.eslora = leer.nextInt();
        System.out.print("Año de fabricación: ");
        this.anioFabricacion = leer.nextInt();
        
    }

    public int calcularModulo() {
        return this.eslora * 10;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfaces.CalculosFormas;

/**
 *
 * @author Byte Shop
 */
public class Circulo implements CalculosFormas{
    private double diametro;
    private double radio;

    public Circulo() {
    }

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    @Override
    public void calcularArea() {
        double areaCirc;
        areaCirc = PI * (Math.pow(this.radio, 2));
        
        System.out.println("El área del círculo es " + areaCirc);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroCirc;
        perimetroCirc = PI * this.diametro;
        
        System.out.println("El perímetro del círculo es " + perimetroCirc);
    }
    
    
}

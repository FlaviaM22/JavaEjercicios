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
public class Rectangulo implements CalculosFormas {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public void calcularArea() {
        int areaRect;
        areaRect = this.base * this.altura;
        System.out.println("El área del rectángulo es igual a " + areaRect);
    }

    @Override
    public void calcularPerimetro() {
       int perimetroRect;
       perimetroRect = (this.base + this.altura) * 2;
        System.out.println("El perímetro del rectángulo es igual a " + perimetroRect);
    }
    
    
    
}

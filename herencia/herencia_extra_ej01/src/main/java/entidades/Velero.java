/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;



/**
 *
 * @author Byte Shop
 */
public class Velero extends Barco {
    private int cantMastiles;

    public Velero() {
    }

    public Velero(int cantMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.print("Cantidad de mástiles: ");
        this.cantMastiles = leer.nextInt();
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo() + this.cantMastiles;
    }

}

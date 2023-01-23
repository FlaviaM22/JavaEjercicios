/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;



/**
 *
 * @author Byte Shop
 */
public class AMotor extends Barco {
    
    private int potenciaCV;

    public AMotor() {
    }

    public AMotor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.print("Potencia en CV: ");
        this.potenciaCV = leer.nextInt();
    }
    

    @Override
    public int calcularModulo() {
        return super.calcularModulo() + this.potenciaCV; 
    }
    
    
    
}

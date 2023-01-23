/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author Byte Shop
 */
public class Yate extends AMotor {
    private int cantCamarotes;

    public Yate() {
    }

    public Yate(int cantCamarotes, int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.print("Cantidad de camarotes: ");
        this.cantCamarotes = leer.nextInt();
    }
    
    

    @Override
    public int calcularModulo() {
        return super.calcularModulo() + this.cantCamarotes; 
    }

    
    
    

    

   
    
    
}

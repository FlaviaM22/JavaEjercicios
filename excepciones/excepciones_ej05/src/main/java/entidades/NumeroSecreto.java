/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Byte Shop
 */
public class NumeroSecreto {
    private int numSecreto;

    public NumeroSecreto() {
        numSecreto = (int) (Math.random()*500) + 1;
    }

    public NumeroSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    @Override
    public String toString() {
        return "NumeroSecreto{" + "numSecreto=" + numSecreto + '}';
    }
    
    
    
}

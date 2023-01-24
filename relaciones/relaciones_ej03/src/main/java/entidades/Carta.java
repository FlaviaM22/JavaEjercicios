/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.Palo;
import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Carta {
    private int numero;
    private Palo palo;              //Utilizo el enum palo

    public Carta() {
        
    }

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    
//    public void crearBaraja(){                                //método Leo
//        
//       Baraja BB=new Baraja();
//        System.out.println("Crearemos la primera baraja");
//        for (Palos aux : Palos.values()) {
//           String p=aux.getNombre();
//            for (int i = 1; i < 13; i++) {
//                if (i!=8&&i!=9) {
//                    Cartas c=new Cartas(i,p);
//                    c.setNumero(i);
//                    c.setPalo(p);
//                    B.add(c);
//                } 
//                }
//    }
// System.out.println("la baraja esta creada");
//     BB.setBaraja(B);
//        for (Cartas cartas : B) {
//            System.out.println(cartas);
//        }
//    }
    
    public ArrayList<Carta> crearCarta(){
        ArrayList<Carta> mazoDeCartas = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < 12; i++) {
            cont++; 
            if (cont != 8 && cont != 9) {
            Carta carta = new Carta();
            carta.setNumero(cont);   
            carta.setPalo(Palo.BASTO);
            mazoDeCartas.add(carta);
            
            carta = new Carta();
            carta.setNumero(cont);   
            carta.setPalo(Palo.COPA);
            mazoDeCartas.add(carta);
            
            carta = new Carta();
            carta.setNumero(cont);   
            carta.setPalo(Palo.ESPADA);
            mazoDeCartas.add(carta);
            
            carta = new Carta();
            carta.setNumero(cont);   
            carta.setPalo(Palo.ORO);
            mazoDeCartas.add(carta);          
            }     
        }

        return mazoDeCartas;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }        
}

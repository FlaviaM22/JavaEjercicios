/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Byte Shop
 */
public class Juego {

    private ArrayList<Jugador> listaJugadores = new ArrayList();
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> listaJugadores, RevolverDeAgua revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setR(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

//    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        Jugador j = new Jugador();
        listaJugadores = j.crearJugadores();
        revolver = r;
    }

//    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda() {
        boolean flag;
        boolean flag2 = true;
        do{
        for (Jugador aux : listaJugadores) {
            System.out.println("Turno de " + aux.getNombre());
            flag = aux.disparo(revolver);
            if (flag) {
                System.out.println("¡Mojado!");
                flag2 = false;
                break;
            } else {
                System.out.println("Siguiente disparo.");
                System.out.println(" ");
            }
        }
        }while(flag2);
        System.out.println("¡Juego finalizado!");
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", revolver=" + revolver + '}';
    }
}

/*
id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica 
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 

 */
package entidades;
//

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class Jugador {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
   public ArrayList<Jugador> crearJugadores(){
       ArrayList<Jugador> listaJugadores = new ArrayList<>();
       System.out.println("Por favor, ingrese la cantidad de jugadores");
       int cantJugadores  = leer.nextInt();
       
       if(cantJugadores <= 0 || cantJugadores > 6 )
           cantJugadores = 6;
       
       for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = new Jugador();
            listaJugadores.add(jugador);
       }
       int cont = 1;
       for (Jugador aux : listaJugadores) {
            aux.setId(cont);
            aux.setNombre("Jugador " + cont);
            cont++;
        }
       
       return listaJugadores;
   }
    
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo(RevolverDeAgua r){
        mojado = r.mojar();
        if (mojado == false) {
            System.out.println("Usted no se ha mojado, continua el siguiente jugador");
        }
        r.siguienteChorro();
        
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }       
}

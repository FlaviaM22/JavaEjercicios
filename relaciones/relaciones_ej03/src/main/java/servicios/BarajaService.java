/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class BarajaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> cartasEntregadas = new ArrayList<>();
    ArrayList<Carta> listaCartas = new ArrayList<>();
    Baraja baraja = new Baraja();

    public Baraja crearBaraja() {
        Carta c = new Carta();
        listaCartas = c.crearCarta();
        baraja.setMazo(listaCartas);

        return baraja;
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente 
    public Baraja barajar(Baraja b) {
        System.out.println("----MEZCLAR----");
        System.out.println(" ");
        Collections.shuffle(b.getMazo());

        return b;
    }

//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Baraja siguienteCarta(Baraja b) {
        Carta aux;
        if (!b.getMazo().isEmpty()) {                             //Si el array no está vacío, se ejecuta el if
            System.out.println("----SIGUIENTE CARTA----");
            for (int i = 0; i < 1; i++) {
                System.out.println(b.getMazo().get(i));
                aux = b.getMazo().get(i);                   //Lo guardo en un auxilliar para poder agregar a una lista y eliminarlo de la anterior
                cartasEntregadas.add(aux);
                b.getMazo().remove(aux);
            }
        } else {
            System.out.println("Lo sentimos, no hay más cartas disponibles.");
        }

        System.out.println(" ");
        return b;
    }

// • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(Baraja b) {
        System.out.println("----CANTIDAD DE CARTAS DISPONIBLES-----");
        System.out.println(b.getMazo().size());
        System.out.println(" ");
    }

//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
//debemos indicárselo al usuario.
    public Baraja darCartas(Baraja b) {
        System.out.println("Ingrese la cantidad de cartas que desea.");
        int cant = leer.nextInt();
        Carta aux;
        if (cant <= b.getMazo().size()) {
            for (int i = 0; i < cant; i++) {
                System.out.println(b.getMazo().get(i));
                aux = b.getMazo().get(i);
                cartasEntregadas.add(aux);
                b.getMazo().remove(aux);
            }
        } else {
            System.out.println("No hay la cantidad de cartas solicitadas.");    
        }
        System.out.println(" ");
        return b;
    }

//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
//indicárselo al usuario
    public void cartasMonton() {
        if (cartasEntregadas.isEmpty()) {
            System.out.println("No hay cartas para mostrar");
        } else {
            System.out.println("----CARTAS ENTREGADAS----");
            for (Carta aux : cartasEntregadas) {
                System.out.println(aux);
            }
        }
        System.out.println(" ");
    }

//     mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(Baraja b) {
        System.out.println("----MOSTRAR BARAJA----");
        for (Carta aux : b.getMazo()) {
            System.out.println(aux.toString());
        }
        System.out.println(" ");
    }

    public void menu(Baraja b) {
        boolean flag = true;
        System.out.println("---Bienvenido a PLAYING CARDS----");
        do {
            System.out.println("Elija una opción: ");
            System.out.println("1. Barajar\n"
                    + "2. Siguiente carta\n"
                    + "3. Mostrar las cartas disponibles\n"
                    + "4. Dar cartas\n"
                    + "5. Mostrar las cartas ya entregadas\n"
                    + "6. Mostrar cartas restantes de la baraja\n"
                    + "7. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    barajar(b);
                    break;
                case 2:
                    siguienteCarta(b);
                    break;
                case 3:
                    cartasDisponibles(b);
                    break;
                case 4:
                    darCartas(b);
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja(b);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    flag = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (flag);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler alquiler = new Alquiler();

    public void crearAlquiler() {

        System.out.println("-------------Sí desea alquilar un amarre, por favor, complete los siguentes datos-------------");
        System.out.println("Ingrese su nombre");
        alquiler.setNombreCliente(leer.next());
        System.out.println("Ingrese su DNI");
        alquiler.setDni(leer.nextLong());
        System.out.println("Por favor, ingrese la fecha de inicio del alquiler con el formato año/mes/día");
        String fechaInicio = leer.next();
        Date fechaIn = new Date(fechaInicio);
        alquiler.setFechaInicio(fechaIn);
        System.out.println("Por favor, ingrese la fecha de finalización del alquiler con el formato año/mes/día");
        String fechaEntrega = leer.next();
        Date fechaOut = new Date(fechaEntrega);
        alquiler.setFechaEntrega(fechaOut);
        System.out.println("Por favor, indique la posición de amarre a alquilar");
        alquiler.setPosicion(leer.nextInt());
    }

    public void menu(){
        crearAlquiler();
        System.out.println(" ");
        
        System.out.println("Seleccione el tipo de barco a amarrar: \n"
                + "1)Barco\n"
                + "2)Velero\n"
                + "3)Barco a motor\n"
                + "4)Yate");
        int opcion = leer.nextInt();
       
        switch (opcion) {
            case 1:
                Barco barco = new Barco();
                barco.crearBarco();
                System.out.println(" ");
                System.out.println("El costo de su alquiler es de $" + (barco.calcularModulo() * alquiler.calcularDias()));
                break;
            case 2:
                Velero velero = new Velero();
                velero.crearBarco();
                System.out.println(" ");
                System.out.println("El costo de su alquiler es de $" + (velero.calcularModulo() * alquiler.calcularDias()));
                break;
            case 3:
                AMotor aMotor = new AMotor();
                aMotor.crearBarco();
                System.out.println(" ");
                System.out.println("El costo de su alquiler es de $" + (aMotor.calcularModulo() * alquiler.calcularDias()));
                break;
            case 4:
                Yate yate = new Yate();
                yate.crearBarco();
                System.out.println(" ");
                System.out.println("El costo de su alquiler es de $" + (yate.calcularModulo() * alquiler.calcularDias()));
                break;
        }    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Byte Shop
 */
public class Alquiler {

    private String nombreCliente;
    private long dni;
    private Date fechaInicio;
    private Date fechaEntrega;
    private int posicion;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, long dni, Date fechaInicio, Date fechaEntrega, int posicion) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.posicion = posicion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int calcularDias() {          //Convierto ambas fechas a milisegundos, las resto 
                                         //y las convierto a la cantidad de días que resultan esos milisegundos    
        int milisegundosPorDia = 86400000;
        return (int) (this.fechaEntrega.getTime() - this.fechaInicio.getTime()) / milisegundosPorDia;
    }

}

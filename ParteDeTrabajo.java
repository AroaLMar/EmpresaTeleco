package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParteDeTrabajo implements Comparable<ParteDeTrabajo> {

    //ATRIBUTOS
    private String descripcionTrabajo;
    private int numeroHorasInvertidas;
    private double costeHora;
    private int FechaDeCreacion;


    //CONSTRUCTOR
    public ParteDeTrabajo(String descripcionTrabajo, int numeroHorasInvertidas, double costeHora, int fechaDeCreacion) throws ExArgumentoIncorrecto {
        this.descripcionTrabajo = descripcionTrabajo;
        if (descripcionTrabajo == null) throw new ExArgumentoIncorrecto("La descripcion no puede ser nula");
        this.numeroHorasInvertidas = numeroHorasInvertidas;
        if (numeroHorasInvertidas < 0)
            throw new ExArgumentoIncorrecto("Las horas invertidas no pueden ser menor que cero");
        this.costeHora = costeHora;
        if (costeHora <= 0.0)
            throw new ExArgumentoIncorrecto("El precio coste por hora no puede ser menor o igual a cero");
        this.FechaDeCreacion = fechaDeCreacion;


    }

    //GETTERS Y SETTERS

    public String getDescripcionTrabajo() {

        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {

        this.descripcionTrabajo = descripcionTrabajo;
    }

    public int getNumeroHorasInvertidas() {
        return numeroHorasInvertidas;
    }

    public void setNumeroHorasInvertidas(int numeroHorasInvertidas) {
        this.numeroHorasInvertidas = numeroHorasInvertidas;
    }

    public double getCosteHora() {

        return costeHora;
    }

    public void setCosteHora(double costeHora) {

        this.costeHora = costeHora;
    }

    public int getFechaDeCreacion() {

        return FechaDeCreacion;
    }

    public void setFechaDeCreacion(int fechaDeCreacion) {

        FechaDeCreacion = fechaDeCreacion;
    }


    public double costeTotal() {

        return numeroHorasInvertidas * costeHora;

    }

    @Override
    public String toString() {
        return "-ParteDeTrabajo  {" +
                "descripcionTrabajo=" + descripcionTrabajo +
                ", numeroHorasInvertidas=" + numeroHorasInvertidas +
                ", costeHora=" + costeHora +
                ", FechaDeCreacion=" + FechaDeCreacion +
                ", CosteTotal=" + costeTotal() +
                "}\n ";
    }

    //IMPLEMENTAR EL METODO COMPARETO PARA ORDENAR POR FECHA DE CREACION
    @Override
    public int compareTo(ParteDeTrabajo other) {
        if (this.getFechaDeCreacion() > other.getFechaDeCreacion()) return 1;
        if (this.getFechaDeCreacion() < other.getFechaDeCreacion()) return -1;
        return other.getDescripcionTrabajo().compareTo(this.descripcionTrabajo) * (-1);
    }


}


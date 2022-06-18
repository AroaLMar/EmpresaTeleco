package com.company;

public class ParteDeIncidencia extends ParteDeTrabajo {

    private int descuento;

    public ParteDeIncidencia(String descripcionTrabajo, int numeroHorasInvertidas, double costeHora, int fechaDeCreacion, int descuento) throws ExArgumentoIncorrecto {
        super(descripcionTrabajo, numeroHorasInvertidas, costeHora, fechaDeCreacion);
        this.descuento = descuento;
        if ((descuento <= 0) || descuento >= 100)
            throw new ExArgumentoIncorrecto("El descuento tiene que ser mayor que 0 y menor que 100");
    }


    public double costeTotal() {

        return getNumeroHorasInvertidas() * (getCosteHora() - (getCosteHora() * (descuento / 100)));


    }

}

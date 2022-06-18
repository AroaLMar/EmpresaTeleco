package com.company;

public class ParteDeSolicitud extends ParteDeTrabajo {

    private int recargo;

    public ParteDeSolicitud(String descripcionTrabajo, int numeroHorasInvertidas, double costeHora, int fechaDeCreacion, int recargo) throws ExArgumentoIncorrecto {
        super(descripcionTrabajo, numeroHorasInvertidas, costeHora, fechaDeCreacion);
        this.recargo = recargo;
        if ((recargo <= 0) || recargo >= 100)
            throw new ExArgumentoIncorrecto("El descuento tiene que ser mayor que 0 y menor que 100");

    }

    public double costeTotal() {

        return getNumeroHorasInvertidas() * (getCosteHora() + (getCosteHora() * (recargo / 100)));


    }
}

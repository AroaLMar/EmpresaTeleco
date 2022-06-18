package com.company;

import java.util.ArrayList;

public class Gestor {

    //ATRIBUTOS
    private String nombreEmpresa;
    private ArrayList<Cliente> clientes;


    //CONSTRUCTOR

    public Gestor(String nombreEmpresa, ArrayList<Cliente> clientes) throws ExArgumentoIncorrecto {
        this.nombreEmpresa = nombreEmpresa;
        if (nombreEmpresa == null) throw new ExArgumentoIncorrecto("El nombre del cliente no puede ser nulo");
        this.clientes = clientes;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


    //METODO QUE AÑADE UN CLIENTE
    public void addCliente(Cliente c) {

        clientes.add(c);


    }

    //METODO QUE AÑADE UN PARTE A UN CLIENTE

    public void asignaParte(Cliente cli, ParteDeTrabajo p) {

        cli.asignarParte(p);

    }


    //MEOTOD QUE CALCULA EL COSTE TOTAL DE TODOS LOS PARTES DE TODOS LOS CLIENTES
    public double calculaCosteTotal() {

        double result = 0.0;

        for (Cliente cli : clientes) {
            result += cli.calculaCosteTotal();
        }
        return result;

    }

    //METODO QUE DEVUELVE LA INFORMACION DE TODAS LOS PARTES ORDENADOS POR FECHA DE CREACION

    public String obtenerFacturaFechaCreacion() {

        String result = " ";
        for (Cliente cli : clientes) {
            result+= "Cliente " + cli.getNIF() + "\n" + cli.obtenerFacturaFechaCreacion();
        }
        return result;
    }


    //METODO QUE DEVUELVE LA INFORMACION DE TODAS LOS PARTES ORDENADOS POR COSTE

    public String getFacturaCoste() {

        String result = " ";
        for (Cliente cli : clientes) {
            result+= "Cliente " + cli.getNIF() + "\n" + cli.getFacturaCoste();
        }

        return result;
    }


}

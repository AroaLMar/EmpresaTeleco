package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Cliente{

    //ATRIBUTOS

    private String NIF;
    private String nombre;
    private String direccion;
    private ArrayList<ParteDeTrabajo> partes;

    //CONSTRUCTOR

    public Cliente(String NIF, String nombre, String direccion, ArrayList<ParteDeTrabajo> partes) throws ExArgumentoIncorrecto {

        this.NIF = NIF;
        if(NIF==null)throw new ExArgumentoIncorrecto("El NIF  no puede ser nulo");
        this.nombre = nombre;
        if(nombre==null)throw new ExArgumentoIncorrecto("El nombre  no puede ser nulo");
        this.direccion = direccion;
        if(direccion==null)throw new ExArgumentoIncorrecto("La direccion no puede ser nula");
        this.partes = partes;

    }

    public String getNIF() {

        return NIF;
    }

    public void setNIF(String NIF) {

        this.NIF = NIF;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public ArrayList<ParteDeTrabajo> getPartes() {

        return partes;
    }

    public void setPartes(ArrayList<ParteDeTrabajo> partes) {

        this.partes = partes;
    }

    //METODO PARA AÑADIR PARTES

    public void asignarParte(ParteDeTrabajo p){
        partes.add(p);


    }

    //METODO QUE CALCULA EL COSTE TOTAL DE LOS PARTES DE UN CLIENTE
    public float calculaCosteTotal(){

        float resultado=0;

        for (ParteDeTrabajo parte : partes) {
            resultado+= parte.costeTotal();
        }
        return resultado;
    }

    //METODO QUE DEVUELVE LA INFORMACION DE LOS PARTES Y EL COSTE DE UN CLIENTE ORDENADO POR FECHA DE CREACION

    public String obtenerFacturaFechaCreacion(){
        String result = " ";
        Collections.sort(partes);
        for (ParteDeTrabajo parte : partes) {
            result+=parte.toString();
            System.out.println();
        }
        return result;
    }

    //METODO QUE DEVUELVE LA INFORMACION Y EL COSTE DE LOS PARTES DE UN CLIENTE ORDENADOS POR COSTE
    public String getFacturaCoste(){
        String result=" ";
        Collections.sort(partes,new ComparaFacturaPrecioFinal());
        for (ParteDeTrabajo parte : partes) {
            result+=parte.toString();
            System.out.println();
        }
        return result;

    }

    //METODO TOSTRING

    @Override
    public String toString() {
        return "CLIENTE:\n" +
                "  NIF=" + NIF +
                ", nombre=" + nombre  +
                ", direccion=" + direccion +
                " \nPARTES: \n" + partes;
    }
}

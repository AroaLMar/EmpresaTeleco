package com.company;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws ExArgumentoIncorrecto {


       //CREAMOS CLIENTES
        Cliente cli = new Cliente("04227999M", "Maria", "Calle del Sol,10", new ArrayList<ParteDeTrabajo>());
        Cliente cli2= new Cliente("7044685J", "David", "Calle Trinidad, 6", new ArrayList<ParteDeTrabajo>());


        //CREAMOS PARTES DE TRABAJO
        ParteDeTrabajo p1 = new ParteDeTrabajo("Parte Trabajo General FEB", 7, 23.6, 20220228);
        ParteDeTrabajo p2 = new ParteDeTrabajo("Parte Trabajo General MAY", 23, 12.5, 20220530);
        ParteDeTrabajo p3 = new ParteDeIncidencia("Parte Trabajo Incidencia ENE", 38, 6.2, 20220117, 50);
        ParteDeTrabajo p4 = new ParteDeIncidencia("Parte Trabajo Incidencia OCT", 25, 4.2, 20221030, 40);
        ParteDeTrabajo p5 = new ParteDeSolicitud("Parte Trabajo Solicitud NOV", 11, 27.3, 20221128, 30);
        ParteDeTrabajo p6 = new ParteDeSolicitud("Parte Trabajo Solicitud AGO", 9, 17.3, 20220822, 20);



        //CREO UN GESTOR Y LE AÑADO 2 CLIENTES
        Gestor gestor=new Gestor("PROG22",new ArrayList<Cliente>());
        gestor.addCliente(cli);
        gestor.addCliente(cli2);

        //AÑADIMOS VARIOS PARTES A CADA CLIENTE

        cli.asignarParte(p1);
        cli.asignarParte(p3);
        cli.asignarParte(p5);
        cli2.asignarParte(p2);
        cli2.asignarParte(p4);
        cli2.asignarParte(p6);

        //LISTAR LAS FACTURAS POR FECHA Y COSTE PARA CADA CLIENTE


        String facFecha=gestor.obtenerFacturaFechaCreacion();
        System.out.println("Facturas por Fecha de Creacion\n "+facFecha);


        String facCoste=gestor.getFacturaCoste();
        System.out.println("Facturas por Coste\n "+facCoste);



        //CALCULA EL COSTE TOTAL DE LA EMPRESA

        double costeTotalEmpresa=gestor.calculaCosteTotal();
        System.out.println("Coste Total de la empresa: "+gestor.getNombreEmpresa());
        System.out.println(costeTotalEmpresa +" Euros");


    }

 }

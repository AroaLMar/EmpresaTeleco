package com.company;

import java.util.Comparator;


//Creamos una clase nueva y la utilizamos para ordenarla por costeTotal


public class ComparaFacturaPrecioFinal implements Comparator<ParteDeTrabajo> {

    @Override
    public int compare(ParteDeTrabajo p1, ParteDeTrabajo p2) {
        if (p2.costeTotal() > p1.costeTotal()) {
            return -1;
        } else {
            return 1;
        }


    }
}

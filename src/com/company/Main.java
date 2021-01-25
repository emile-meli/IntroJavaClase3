package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1 TM
        System.out.println("Ordenamiento de Personas");
        Persona[] arr = {new Persona("Juan", 123), new Persona("Pablo", 12), new Persona("Raul", 400)};
        SortUtil.ordenar(arr);
        for (Persona per: arr){
            System.out.println(per.getNombre() + ", " + per.getDni());
        }

        System.out.println("Ordenamiento celulares");
        Celular[] arr2 = {new Celular("Juan", 123), new Celular("Pablo", 212), new Celular("Raul", 001)};
        SortUtil.ordenar(arr2);
        for (Celular cel: arr2){
            System.out.println(cel.getTitular() + ", " + cel.getNumero());
        }
    }
}

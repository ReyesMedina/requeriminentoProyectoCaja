package com.ibm.academia.appcubo;

import com.ibm.academia.appcubo.modelo.Caja;

public class Main {
    public static void main(String[] args) {
        Caja cajaMadera = new Caja(3,2,6);
        int volumenCajaMadera = cajaMadera.calcularVolumen();

        System.out.println("El volumen de la caja es " + volumenCajaMadera);
    }



}

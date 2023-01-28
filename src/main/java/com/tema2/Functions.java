package com.tema2;

public class Functions {

    public double getPrecioIVA(double monto){
        double precioIva = 0.00;

        precioIva = monto * 1.16;

        return precioIva;
    }
}

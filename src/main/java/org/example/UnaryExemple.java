package org.example;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryExemple {
    public static void main(String[] args) {

        UnaryOperator<Double> retornarDobro = n -> n*n;
        UnaryOperator<Double> somarDez = n -> n+10;
        UnaryOperator<Double> dividir = n -> n/2;

        Double apply = retornarDobro
                .andThen(somarDez)
                .andThen(dividir)
                .apply(10.0);

        System.out.println(apply);

    }
}
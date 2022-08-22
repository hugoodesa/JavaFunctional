package org.example;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExemple {
    public static void main(String[] args) {

        Supplier<Integer> retonarInteiro = () -> 2;

        System.out.println(retonarInteiro.get());

    }
}
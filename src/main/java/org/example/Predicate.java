package org.example;

import org.example.model.Produto;

import java.math.BigDecimal;

public class Predicate {
    public static void main(String[] args) {

        java.util.function.Predicate<Produto> isCaro = produto -> produto.isCaro();
        boolean notebook = isCaro.test(new Produto("Notebook", new BigDecimal(2000)));
        System.out.println(notebook);
    }
}
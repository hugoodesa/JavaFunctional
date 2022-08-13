package org.example;

import java.util.function.BinaryOperator;

public class BinaryOpertorMain {
    public static void main(String[] args) {

        BinaryOperator<Integer> somar = ((a, b) -> a+b);
        Integer apply = somar.apply(1, 2);
        System.out.println(apply);
    }
}
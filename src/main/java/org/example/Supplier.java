package org.example;

import java.util.function.Predicate;

public class Supplier {
    public static void main(String[] args) {

        Predicate<Integer> isPar = n -> (n % 2) == 0;
        Predicate<Integer> isMaisTresDigitos = n -> n >= 100 ;

        //boolean test = isPar.and(isMaisTresDigitos).test(122);
        boolean test = isPar.and(isMaisTresDigitos).test(122);

        System.out.println(test);
    }
}
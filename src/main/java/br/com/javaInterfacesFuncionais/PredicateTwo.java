package br.com.javaInterfacesFuncionais;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTwo {
    public static void main(String[] args) {

        Predicate<Integer> isPar = numero -> (numero%2)==0;
        Predicate<Integer> isTresDigitos = numero -> (numero>99);

        boolean test = isPar.and(isTresDigitos).negate().test(2);
        System.out.println(test);

    }
}
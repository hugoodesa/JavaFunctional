package br.com.javaInterfacesFuncionais;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorComposition {
    public static void main(String[] args) {

        BinaryOperator<Double> calcularMedia = (n1,n2) -> (n1+n2)/2;
        Function<Double,Boolean> isAprovado = (media) -> media>=7;

        Boolean apply = calcularMedia.andThen(isAprovado).apply(6.0, 8.0);
        System.out.println(apply);

    }
}
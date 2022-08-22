package br.com.javaInterfacesFuncionais;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {

        Function<Integer,String> parOuImpar = n -> n%2==0 ? "par" : "impar";
        Function<String,String> dizerResultado = resultado -> "O resultado foi : " +resultado;
        Function<String,String> empolgado = resultado -> resultado.toUpperCase();
        Consumer<String> printarNaTela = resultado -> System.out.println(resultado);

        String resultado = parOuImpar.andThen(dizerResultado).andThen(empolgado).apply(15);
        printarNaTela.accept(resultado);
    }
}
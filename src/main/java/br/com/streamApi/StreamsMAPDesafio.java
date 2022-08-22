package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Produto;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamsMAPDesafio {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, String> convertToBinaryString = n -> Integer.toBinaryString(n);
        UnaryOperator<String> convertToInterger = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> convertToBinaryInteger = (s -> Integer.parseInt(s,2));



    }
}

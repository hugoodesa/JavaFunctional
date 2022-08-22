package br.com.javaInterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer sayNumber = number -> System.out.println(number);

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.forEach(sayNumber);

    }
}
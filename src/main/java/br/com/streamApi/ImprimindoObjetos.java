package br.com.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Mia","Luka","Leo","Isa");


        System.out.println("ForEach aprovado");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        Iterator<String> iterator = aprovados.iterator();
        System.out.println("Printando usando iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Printando usando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}

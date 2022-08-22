package br.com.streamApi;

import br.com.javaInterfacesFuncionais.interfaceFuncional.MinhaInterfaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Stream<String> stream = Stream.of("Java ", "Spring ", " JPA\n");
        stream.forEach(print);

        String[] arrayString = {"JS ","REACT "," Angular\n"};
        Stream<String> streamFromArray = Stream.of(arrayString);
        streamFromArray.forEach(print);
        Arrays.stream(arrayString).forEach(print);

        List<String> newLangs = Arrays.asList("PHP"," Kotlin"," Django\n");
        newLangs.stream().forEach(print);

    }
}

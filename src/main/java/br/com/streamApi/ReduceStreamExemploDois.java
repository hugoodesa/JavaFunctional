package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReduceStreamExemploDois {

    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Gui",5.5),
                new Aluno("Mia",6.5),
                new Aluno("Lia",7.5),
                new Aluno("Bia",8.5)
        );

        Predicate<Aluno> aprovado = Aluno::isAprovado;;
        Function<Aluno,Double> apenasNotas = Aluno::getNota;
        BinaryOperator<Double> somatorio = (acc,n)-> acc+n;

        Double aDouble = alunos.stream().filter(aprovado).map(apenasNotas).reduce(somatorio).get();

        System.out.println(aDouble);
    }
}

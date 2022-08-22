package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MatchStreamExemplo {

    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Gui",5.5),
                new Aluno("Mia",6.5),
                new Aluno("Lia",7.5),
                new Aluno("Bia",8.5)
        );

        Predicate<Aluno> aprovado = Aluno::isAprovado;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().allMatch(aprovado));
    }
}

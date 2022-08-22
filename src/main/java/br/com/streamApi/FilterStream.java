package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Aluno;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterStream {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ricador",8.8);
        Aluno a2 = new Aluno("Richarles",7.0);
        Aluno a3 = new Aluno("Rick",7.8);
        Aluno a4 = new Aluno("Henrique",2.8);
        Aluno a5 = new Aluno("Luiz",4.8);
        Aluno a6 = new Aluno("Richard",6.8);

        Stream<Aluno> alunos = Stream.of(a1,a2,a3,a4,a5,a6);
        Predicate<Aluno> aprovado = Aluno::isAprovado;
        Predicate<Aluno> nomeContemMaisDeQuatroLetras = aluno -> aluno.getNome().length()>4;
        Consumer<Aluno> print = a -> System.out.println(a.getNome());

        alunos
                .filter(aprovado)
                .filter(nomeContemMaisDeQuatroLetras)
                .forEach(print);

    }
}

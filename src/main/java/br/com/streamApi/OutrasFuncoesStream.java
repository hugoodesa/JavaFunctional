package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OutrasFuncoesStream {

    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Gui",5.5),
                new Aluno("Mia",6.5),
                new Aluno("Lia",7.5),
                new Aluno("Bia",8.5)
        );

        Comparator<Aluno> melhorNota = (a1,a2) ->{
          if(a1.getNota()>a2.getNota()) return 1;
          if(a1.getNota()<a2.getNota()) return -1;
          return 0;
        };

        Aluno aluno = alunos.stream().max(melhorNota).get();
        Aluno pior = alunos.stream().min(melhorNota).get();
        System.out.println(aluno);

    }
}

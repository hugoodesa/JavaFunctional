package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Aluno;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReduceStream {

    public static void main(String[] args) {

        Stream reduceExemplo = Stream.of(7,3,4,2,8,1,2,8);

        BinaryOperator<Integer> sum = (acc,n) -> acc+n;

        Optional reduce = reduceExemplo.reduce(sum);

        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }

        Object reduce1 = reduceExemplo.reduce(100, sum);

    }
}

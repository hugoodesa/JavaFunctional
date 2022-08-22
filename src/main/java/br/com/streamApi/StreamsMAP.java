package br.com.streamApi;

import br.com.javaInterfacesFuncionais.model.Produto;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamsMAP {
    public static void main(String[] args) {

        Consumer<Integer> print = System.out::println;
        UnaryOperator<Integer> dobrarValor = (n -> n * 2);
        UnaryOperator<Integer> subtrairDois = (n -> n - 2);

        Stream<Integer> streamInteger = Stream.of(3, 1, 7, 4, 6, 5, 8, 10, 9);
        Stream<Integer> integerStream = streamInteger.map(dobrarValor).map(subtrairDois);

        integerStream.forEach(print);

        //extrair nome do produto

        Consumer<BigDecimal> printBigdecimal = p -> System.out.print(" "+p);


        Stream<Produto> produtos = Stream.of(
                new Produto("produto1",new BigDecimal(200)),
                new Produto("produto2",new BigDecimal(110)),
                new Produto("produto3",new BigDecimal(105)),
                new Produto("produto4",new BigDecimal(233))
        );

        Function<Produto, BigDecimal> obterPrecoProduto = Produto::getPreco;
        produtos.map(obterPrecoProduto).forEach(printBigdecimal);
    }
}

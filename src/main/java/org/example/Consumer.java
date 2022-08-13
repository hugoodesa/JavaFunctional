package org.example;

import org.example.model.Produto;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {


        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook",new BigDecimal(5000.0)),
                new Produto("Monitor",new BigDecimal(1000.0)),
                new Produto("Teclado",new BigDecimal(100.0)),
                new Produto("Mouse",new BigDecimal(50.0))
        );

        java.util.function.Consumer<Produto> mostrarProduto = produto -> System.out.println(produto.toString());

        produtos.forEach(mostrarProduto);

    }
}
package br.com.javaInterfacesFuncionais;

import br.com.javaInterfacesFuncionais.model.Produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto produto = new Produto("iPad",new BigDecimal("3235.89"),new BigDecimal("0.1"));

        //1 aplicar o preco com desconto
        UnaryOperator<Produto> aplicarDescontoProduto = p ->  {
            p.aplicarDesconto();
            return p;
        };

        //2 imposto municipal >= 2500 (8,5%) / <2500 (Isento)
        UnaryOperator<Produto> calcularImpostoMunicipal = p ->{
            BigDecimal impostoMuinicipal = p.calcularImpostoMunicipal();
            p.setPreco(impostoMuinicipal);
            return p;
        };

        //2 imposto municipal >= 2500 (8,5%) / <2500 (Isento)
        UnaryOperator<Produto> calcularFrete = p ->{
            BigDecimal frete;
            int i = p.getPreco().compareTo(new BigDecimal("3000.0"));
            frete = i >= 0 ? new BigDecimal(100) : new BigDecimal(50);
            p.setPreco(p.getPreco().add(frete));
            return p;
        };

        //3 formatar duas casas decimais
        Function<Produto,BigDecimal> arredondarDuasCasas = p -> p.getPreco().setScale(2, RoundingMode.HALF_UP);

        //4 formatar e printar na tela
        Function<BigDecimal,String> exibirValorMonetario = valor -> "R$ "+valor;


        String apply = aplicarDescontoProduto
                .andThen(calcularImpostoMunicipal)
                .andThen(calcularFrete)
                .andThen(arredondarDuasCasas)
                .andThen(exibirValorMonetario)
                .apply(produto);

        System.out.println(apply);

    }
}

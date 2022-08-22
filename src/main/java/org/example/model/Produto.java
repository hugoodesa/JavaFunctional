package org.example.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {

    private String descricao;
    private BigDecimal preco;

    private BigDecimal desconto;

    public Produto(String descricao, BigDecimal preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String descricao, BigDecimal preco, BigDecimal desconto) {
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
    }

    public boolean isCaro() {
        return this.preco.compareTo(new BigDecimal(1000)) >= 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }



    @Override
    public String toString() {
        return "Produto{" + "descricao='" + descricao + '\'' + ", preco=" + preco + '}';
    }

    public void aplicarDesconto() {
        BigDecimal desconto = BigDecimal.ONE.subtract(this.desconto);
        this.preco.multiply(desconto);
    }

    public BigDecimal calcularImpostoMunicipal() {
        int isImpostoMaior = this.preco.compareTo(new BigDecimal(2500));
        return isImpostoMaior >= 0 ? this.preco.multiply(new BigDecimal(1.085)) : BigDecimal.ZERO;
    }

}

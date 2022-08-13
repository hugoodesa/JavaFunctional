package org.example.model;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private BigDecimal preco;

    public Produto(String descricao, BigDecimal preco) {
        this.descricao = descricao;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Produto{" + "descricao='" + descricao + '\'' + ", preco=" + preco + '}';
    }
}

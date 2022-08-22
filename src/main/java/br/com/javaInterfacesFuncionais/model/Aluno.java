package br.com.javaInterfacesFuncionais.model;

import java.util.Objects;

public class Aluno {

    final String nome;
    final Double nota;


    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Boolean isAprovado() {
        return this.nota>=7;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(nota, aluno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}

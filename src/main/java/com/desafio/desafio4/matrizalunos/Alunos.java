package com.desafio.desafio4.matrizalunos;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    String nome;
    double media;
    String situacao;
    int frequencia;
    List<Double> notasAluno = new ArrayList<Double>();

    public Alunos(String nome, List<Double> notasAluno, int frequencia) {
        this.nome = nome;
        this.situacao = situacao;
        this.notasAluno = notasAluno;
        this.frequencia = frequencia;

        double somNotas = 0;
        for (Double notaAtual : notasAluno) {
            somNotas+=notaAtual;
        }

        this.media = (somNotas/4);

        this.situacao = (((somNotas/4)>=7)&&(frequencia>=75)) ? "Aprovado":"Reprovado";


    }


    public String getNome() {
        return this.nome;
    }

    public double getMedia() {
        return this.media;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public int getFrequencia() {
        return this.frequencia;
    }

    public List<Double> getNotasAluno() {
        return this.notasAluno;
    }



   
    

   
    

}

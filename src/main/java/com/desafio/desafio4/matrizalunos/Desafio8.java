package com.desafio.desafio4.matrizalunos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio8 {
    public static void main(String[] args) throws IOException {
        
        List<Alunos> listaAlunos = new ArrayList<Alunos>();
        String opcoes [] = {"sim","não"};
        
        boolean continuar = true;
        String nome;
        double nota1,nota2,nota3,nota4;
        int frequencia;
        do {
            List<Double> notasAluno = new ArrayList<Double>();
            nome = JOptionPane.showInputDialog("digite no nome do aluno(a)");

            nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("digite a 1º nota do aluno "+nome)
            );
            notasAluno.add(nota1);

            nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("digite a 2º nota do aluno "+nome)
            );
            notasAluno.add(nota2);

            nota3 = Double.parseDouble(
                JOptionPane.showInputDialog("digite a 3º nota do aluno "+nome)
            );
            notasAluno.add(nota3);

            nota4 = Double.parseDouble(
                JOptionPane.showInputDialog("digite a 4º nota do aluno "+nome)
            );
            notasAluno.add(nota3);

            frequencia = Integer.parseInt(
                JOptionPane.showInputDialog("digite a frequência do aluno "+ nome)
            );

            listaAlunos.add(new Alunos(nome, notasAluno, frequencia));

            continuar = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um valor no calculo da média ?", "titulo",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
            )  == JOptionPane.YES_OPTION;

        } while (continuar);
        
        FileWriter arqAprov = new FileWriter("matriz_aprovados.txt");
        PrintWriter grava_arqAprov = new PrintWriter(arqAprov);
        FileWriter arqReprov = new FileWriter("matriz_rerpovados.txt");
        PrintWriter grava_arqReprov = new PrintWriter(arqReprov);

        grava_arqReprov.println("---------Lista Aprovados---------");
        
        grava_arqAprov.println("---------Lista Aprovados---------");

        for (Alunos aluno : listaAlunos) {
            if (aluno.getSituacao().equals("Aprovado")) {
                grava_arqAprov.println("Aluno: "+aluno.getNome());

                for (int i = 0; i < aluno.getNotasAluno().size(); i++) {
                    grava_arqAprov.println((i+1)+"º nota: "+aluno.getNotasAluno().get(i));
                }
                grava_arqAprov.println("Media: "+aluno.getMedia());
                grava_arqAprov.println("Frequência: "+aluno.getFrequencia());
                grava_arqAprov.println("Situação: "+aluno.getSituacao()+"\n\n");

            }else{
                grava_arqReprov.println("Aluno: "+aluno.getNome());

                for (int i = 0; i < aluno.getNotasAluno().size(); i++) {
                    grava_arqReprov.println((i+1)+"º nota: "+aluno.getNotasAluno().get(i));
                }
                grava_arqReprov.println("Media: "+aluno.getMedia());
                grava_arqReprov.println("Frequência: "+aluno.getFrequencia());
                grava_arqReprov.println("Situação: "+aluno.getSituacao()+"\n\n");
            }
        
        }
        
        arqAprov.close();
        arqReprov.close();
        grava_arqAprov.close();
        grava_arqReprov.close();

        /* FileWriter arqAprov = new FileWriter("matriz_aprovados.txt");
        PrintWriter grava_arqAprov = new PrintWriter(arqAprov);

        
        arqAprov.close();
        grava_arqAprov.close(); */

        /* FileWriter arqReprov = new FileWriter("matriz_rerpovados.txt");
        PrintWriter grava_arqReprov = new PrintWriter(arqReprov);

        grava_arqReprov.print(lista_reprovados+"\n"+qtd_reprovados);

        grava_arqReprov.close();
        arqReprov.close(); */


    }
}

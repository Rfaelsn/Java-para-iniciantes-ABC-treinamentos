package com.desafio.desafio4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Desafio8 {
    public static void main(String[] args) throws IOException {
        String nome_alunos [] = new String[5];
        Boolean situacao_aluno [] = new Boolean[5];
        Double notas_alunos [] [] = new Double[5] [4];
        Double calc_media = 0.0;
        int qtd_aprovados = 0,qtd_reprovados = 0;
        String lista_aprovados = "",lista_reprovados = "";



        for (int i = 0; i < nome_alunos.length; i++) {
            nome_alunos[i] = JOptionPane.showInputDialog("digite o nome do "+i+"º aluno");
            for (int j = 0; j < 4; j++) {
                notas_alunos [i] [j] = Double.parseDouble(
                    JOptionPane.showInputDialog("digite a "+j+"º nota do "+i+"º aluno")
                );
                calc_media += notas_alunos [i] [j];
            }

            calc_media = (calc_media/4);
            situacao_aluno [i] = (calc_media >= 5) ? true : false;
            calc_media = 0.0;
        }

        for (int i = 0; i < notas_alunos.length; i++) {
            if (situacao_aluno[i] == true) {
                qtd_aprovados++;
                lista_aprovados += nome_alunos[i] + " \nsituacao: Aprovado\n";
            }else{
                qtd_reprovados++;
                lista_reprovados += nome_alunos[i] + " \nsituacao: Reprovado\n";
            }
        }

        FileWriter arqAprov = new FileWriter("matriz_aprovados.txt");
        PrintWriter grava_arqAprov = new PrintWriter(arqAprov);

        grava_arqAprov.print(lista_reprovados+"\n"+qtd_reprovados);
        arqAprov.close();
        grava_arqAprov.close();

        FileWriter arqReprov = new FileWriter("matriz_rerpovados.txt");
        PrintWriter grava_arqReprov = new PrintWriter(arqReprov);

        grava_arqReprov.print(lista_reprovados+"\n"+qtd_aprovados);

        grava_arqReprov.close();
        arqReprov.close();


    }
}

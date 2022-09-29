package com.unidade5;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MatrizVetorAlunos {
    public static void main(String[] args) {
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

        JOptionPane.showMessageDialog(
            null,"lista de alunos aprovados:\n"+lista_aprovados+"(total ="+qtd_aprovados+")\n\n lista de alunos Reprovados:\n"+lista_reprovados+"\n(total = "+qtd_reprovados+")"
        );
    }
}

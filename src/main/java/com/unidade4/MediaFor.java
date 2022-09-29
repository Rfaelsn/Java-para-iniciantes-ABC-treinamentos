package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MediaFor {
    public static void main(String[] args) {
        int qtdAlunos;
        double mediaTurma = 0,mediaAluno,n1,n2,n3,n4;
        qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alunos"));

        for (int i = 1; i <= qtdAlunos; i++) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("digite a 1 nota do "+i+" aluno"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("digite a 2 nota do "+i+" aluno"));
            n3 = Integer.parseInt(JOptionPane.showInputDialog("digite a 3 nota do "+i+" aluno"));
            n4 = Integer.parseInt(JOptionPane.showInputDialog("digite a 4 nota do "+i+" aluno"));

            mediaAluno = (n1+n2+n3+n4)/4;
            mediaTurma += mediaAluno; 
        }
        
        mediaTurma = (mediaTurma/qtdAlunos);
        JOptionPane.showMessageDialog(null,"a média da turma é : "+mediaTurma);
    }
}

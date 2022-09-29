package com.unidade5;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class VetAlunos {
    public static void main(String[] args) {
        String alunos [] = new String [5];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = JOptionPane.showInputDialog("digite o nome do "+(i+1)+"º aluno: ");
        }

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}

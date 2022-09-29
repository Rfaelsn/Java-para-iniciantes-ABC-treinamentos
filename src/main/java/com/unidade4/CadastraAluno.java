package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CadastraAluno {
    public static void main(String[] args) {
        String nome = "";
        String matricula = "";
        String endereco = "";
        String telefone = "";
        String aluno="";
        String [] opcoes = {"sim","não"};
        boolean continuar = true;
        int cont = 1;

        while (continuar) {

            nome = (JOptionPane.showInputDialog(null, "digite no nome do "+cont+"º aluno(a)")+" ");
            matricula = (JOptionPane.showInputDialog(null, "digite a matricula do "+cont+"º aluno(a)")+" ");
            endereco = (JOptionPane.showInputDialog(null, "digite o endereço do "+cont+"º aluno(a)")+" ");
            telefone = (JOptionPane.showInputDialog(null, "digite telefone do "+cont+"º aluno(a)")+" ");

            aluno +="aluno" +cont+":\n "+"nome: "+nome+"\nmatricula: "+matricula+"\nendereco: "+endereco+"\ntelefone: "+telefone+"\n";
            cont++;
            continuar = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um aluno ?", "!",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
            )  == JOptionPane.YES_OPTION;
        }

        JOptionPane.showMessageDialog(null,aluno);

    }
}

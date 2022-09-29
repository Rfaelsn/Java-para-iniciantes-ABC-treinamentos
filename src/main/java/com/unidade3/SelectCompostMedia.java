package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class SelectCompostMedia {
    public static void main(String[] args) {
        // constantes
        int num_avaliacoes = 4;
        // variaveis
        int frequencia;
        double media, n1, n2, n3, n4;
        //
        JOptionPane.showMessageDialog(null, "sistema de calculo de média");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("digite a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("digite a quarta nota"));
        frequencia = Integer.parseInt(JOptionPane.showInputDialog("digite a frequencia"));
        media = (n1 + n2 + n3 + n4) / num_avaliacoes;
        JOptionPane.showMessageDialog(null, "a sua média é igual a: " + media);
        
        if((media>5 && frequencia>75)){
            JOptionPane.showMessageDialog(null, "aluno aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "aluno Reprovado");
        }
    }
}

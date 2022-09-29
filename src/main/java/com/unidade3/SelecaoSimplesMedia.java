package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class SelecaoSimplesMedia {
    public static void main(String[] args) {
        // constantes
        int num_avaliacoes = 4;
        // variaveis
        double media, n1, n2, n3, n4;
        //
        JOptionPane.showMessageDialog(null, "sistema de calculo de média");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("digite a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("digite a quarta nota"));
        media = (n1 + n2 + n3 + n4) / num_avaliacoes;
        JOptionPane.showMessageDialog(null, "a sua média é igual a: " + media);
        
        if(media<5){
            JOptionPane.showMessageDialog(null, "aluno reprovado");
        }
    }
}

package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class NumDescFor {
    public static void main(String[] args) {
        int valorContagem;
        String result="";

        valorContagem = Integer.parseInt(JOptionPane.showInputDialog("digite o valor para contar de forma decrescente"));

        for (int i=valorContagem; i>=0; i--) {
            result += (String.valueOf(i)+"\n");
        }
        JOptionPane.showMessageDialog(null,result);
    }
}

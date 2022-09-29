package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class ExibeEstrelas {
    public static void main(String[] args) {
        String estrelas = "";
        String result_estrelas = "";
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("digite o número de estrelas que deseja exibir")
        );

        for (int i = 1; i <= numero ; i++) {
            estrelas += "*";
            result_estrelas += estrelas +"\n";
        }

        JOptionPane.showMessageDialog(null, "exibindo estrelas:\n"+result_estrelas);


    }
}

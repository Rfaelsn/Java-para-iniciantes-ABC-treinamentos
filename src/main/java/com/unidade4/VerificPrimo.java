package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class VerificPrimo {
    public static void main(String[] args) {
        int divisores = 0;
        String divisores_result = "";
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(null, "digite um número para verificar se é ou não primo")
        );

        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0) {
                divisores++;
                divisores_result += " "+i;
            }
        }

        if (divisores == 2) {
            JOptionPane.showMessageDialog(null, "o número "+numero+" é um número primo\ndivisivel apenas por: "+divisores_result);
        }else{
            JOptionPane.showMessageDialog(
                null, "o número "+numero+" não é um número primo ele é divisivel por:\n"+divisores_result
            );
        }


    }
}

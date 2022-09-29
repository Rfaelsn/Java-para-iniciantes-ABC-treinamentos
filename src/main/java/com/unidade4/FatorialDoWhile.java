package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class FatorialDoWhile {
    public static void main(String[] args) {
        float fatorial = Float.parseFloat(JOptionPane.showInputDialog("digite o valor que deseja calcular o fatorial"));
        float resultFatorial = fatorial;
        float numero = fatorial;

        do{
            resultFatorial *= fatorial-1;
            fatorial--;
        }while (fatorial>1);

        JOptionPane.showMessageDialog(null, "o resultado do numero "+numero+" é igual a: "+resultFatorial);
    }
}

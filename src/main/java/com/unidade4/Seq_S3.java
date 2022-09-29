package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Seq_S3 {
    public static void main(String[] args) {
        double posicao = Double.parseDouble(JOptionPane.showInputDialog("digite a posição que deseja obter"));
        double resultado = 1;

        for (double i = 1; i < posicao; i++) {
            resultado += 3;
        }

        JOptionPane.showMessageDialog(null,"o resultado da posicação "+posicao+" é: "+resultado);
    }
}

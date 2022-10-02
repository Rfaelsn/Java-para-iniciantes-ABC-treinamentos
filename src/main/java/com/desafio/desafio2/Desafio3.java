package com.desafio.desafio2;

import javax.swing.JOptionPane;

public class Desafio3 {
    public static void main(String[] args) {
        int result = 0;
        int n = Integer.parseInt(
            JOptionPane.showInputDialog("digite um numero para calcular a sequencia S")
        );

        for (int i = 1; i <= n; i++) {
            System.out.print(i+"+");
            result+=i;
        }

        System.out.print("=" + result);
    }
}

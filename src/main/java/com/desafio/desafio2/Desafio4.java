package com.desafio.desafio2;

import javax.swing.JOptionPane;

public class Desafio4 {
    public static int calc(int num){
        if (num ==0){
            return 0;
        }

        return (num + calc(num-1));
    }
    public static void main(String[] args) {
        int result = calc(
            Integer.parseInt(
                JOptionPane.showInputDialog("digite um numero para calcular o resultado de Soma(S)")
            )
        );

        JOptionPane.showMessageDialog(null,result);
    }
}

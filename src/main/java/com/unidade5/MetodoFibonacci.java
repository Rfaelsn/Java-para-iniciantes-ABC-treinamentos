package com.unidade5;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MetodoFibonacci {
    public static void fibinacci(int posicao){
        int s1 = 1;
        int s2 = 1;
        int s = 0;
        
        if (posicao == 1 || posicao == 2) {
            s = 1;
        }else if (posicao <= 0) {
            JOptionPane.showMessageDialog(null,"valor inválido");
            MetodoFibonacci.main(null);
        }else{
            for (int i = 3; i <= posicao; i++) {
                s = s1+s2;
                s1 = s2;
                s2 =  s;
            }
        }
        JOptionPane.showMessageDialog(
            null,"o valor da posicao "+posicao+" de fibonacci é:  "+s
        );
    }

    public static void main(String[] args) {
        int posicao = Integer.parseInt(
            JOptionPane.showInputDialog("digite a posição de fibonacci que você deseja:")
        );
        fibinacci(posicao);
    }
}

package com.aovivo;

import javax.swing.JOptionPane;

public class FibonacciRecursivo {
    public static int fibo (int posicao){
        if (posicao == 1 || posicao == 2) {
            return 1;
        }else if (posicao <= 0) {
            JOptionPane.showMessageDialog(null,"valor inválido");
            FibonacciRecursivo.main(null);
        }

        return fibo(posicao-1) + fibo(posicao-2);
        
        
    }
    public static void main(String[] args) {
        int posicaoFibo = Integer.parseInt(
            JOptionPane.showInputDialog(
                "digite até qual posição da sequÊncia de fibonacci você deseja visualizar:"
            )
        );

        JOptionPane.showMessageDialog(null,"o valor na posição digitada é: "+fibo(posicaoFibo));
       
    }
}

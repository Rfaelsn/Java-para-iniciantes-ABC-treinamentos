package com.aovivo;

import javax.swing.JOptionPane;

public class FatorialRecursivo {
    public static int fatorial(int num){
        if (num == 0) {
            return 1;
        }else{
            return num*fatorial(num-1);
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(
            JOptionPane.showInputDialog("digite o valor que você deseja calcular o fatorial")
        );
        int tot = fatorial(num);
        JOptionPane.showMessageDialog(null,tot);
        
    }

}

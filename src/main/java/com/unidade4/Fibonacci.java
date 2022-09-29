package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Fibonacci {
    public static void main(String[] args) {
        int s1 = 1;
        int s2 = 1;
        int s = 0;
        int elemento;

        elemento = Integer.parseInt(
            JOptionPane.showInputDialog("digite qual elemento você deseja saber da sequência de fibonacci")
        );

        if (elemento == 1 || elemento == 2) {
            s = 1;
        }else if (elemento <= 0) {
            JOptionPane.showMessageDialog(null,"valor inválido");
            Fibonacci.main(null);
        }else{
            System.out.print(s1+","+s2+",");
            for (int i = 3; i <= elemento; i++) {
                s = s1+s2;
                s1 = s2;
                s2 =  s;
                System.out.print(s+",");
            }
        }

        JOptionPane.showMessageDialog(null, "o valor do elemento "+elemento+" da sequência de fibonacci é igual a: "+s+"(sequência completa no terminal)");
    }
}

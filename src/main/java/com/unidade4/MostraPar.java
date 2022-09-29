package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MostraPar {
    public static void main(String[] args) {
        int a,b;
        String result = "";

        JOptionPane.showMessageDialog(
            null,"digite o primeiro valor do intervalo"
        );

        a = Integer.parseInt(
            JOptionPane.showInputDialog("digite o primeiro valor do intervalo")
        );

        b = Integer.parseInt(
            JOptionPane.showInputDialog("digite o primeiro valor do intervalo")
        );

        for (int i = (a+1); i < b; i++) {
            if (i%2 == 0) {
                result += String.valueOf(i)+"\n";
            }
        }

        JOptionPane.showMessageDialog(
            null,"os números pares no intervalo de "
            +a+" para "+b+":\n"+result
        );
    }
}

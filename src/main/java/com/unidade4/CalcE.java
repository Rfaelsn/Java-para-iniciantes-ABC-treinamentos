package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CalcE {
    public static void main(String[] args) {
        float x;
        float e=0;
        int repet;

        x = Float.parseFloat(JOptionPane.showInputDialog("digite o valor de x para calcular a seguinte expressão e^x= x/1+x/2 ..."));

        
        repet = Integer.parseInt(
            JOptionPane.showInputDialog("digite o valor de x para calcular a seguinte expressão e^x= x/1+x/2 ...")
        );

        for(int i = 1; i<=repet; i++){
            e += (Math.pow(x,i)/i);
        }

        JOptionPane.showMessageDialog(null,"o valor de \"e\" é: "+e);

    }
}

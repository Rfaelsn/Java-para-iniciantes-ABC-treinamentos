package com.aovivo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Senx {
    public static void main(String[] args) {
        double x;
        double senx=0;
        double s2 = 1;
        int alternaSinal = 1;

        x = Float.parseFloat(JOptionPane.showInputDialog("digite o valor de x para calcular a seguinte expressão e^x= (x^1)/1+(x^3)/2- ..."));
        

        for (int i = 1; i <= 30; i++) {
            senx += (Math.pow(x,s2)/Senx.fatorial(s2))*alternaSinal;
            alternaSinal *= -1;
            s2 += 2;
        }
       
        JOptionPane.showMessageDialog(null,"o valor de Sen("+x+")  é: \n"+senx);
    }

    public static double fatorial(double numero){
        double fatorial = 1;
        while(numero>0){
            fatorial *= numero;
            numero--;
        }
        return fatorial;
    }
}

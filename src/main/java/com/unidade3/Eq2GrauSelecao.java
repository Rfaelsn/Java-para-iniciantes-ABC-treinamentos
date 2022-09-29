package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Eq2GrauSelecao {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        a= Double.parseDouble(JOptionPane.showInputDialog("digite o valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de C"));

        delta = b*b-4*a*c;

        if (delta>0) {
            x1 = -b - (Math.sqrt(delta))/2*a;
            x2 = -b + (Math.sqrt(delta))/2*a;
            JOptionPane.showMessageDialog(null, "Resultado da equação do 2 grau\n X1: "+x1+"\nX2: "+x2);
        }else{
            JOptionPane.showMessageDialog(null, "não existem raizes reais");
        }


    }
}

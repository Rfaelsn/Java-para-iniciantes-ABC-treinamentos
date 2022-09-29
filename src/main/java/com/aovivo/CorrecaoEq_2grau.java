package com.aovivo;

import javax.swing.JOptionPane;

public class CorrecaoEq_2grau {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        a= Double.parseDouble(JOptionPane.showInputDialog("digite o valor de A"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "o valor de A não forma uma equação do 2º grau");
            CorrecaoEq_2grau.main(null);
        }
        b = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de C"));

        delta = b*b - 4*a*c;

        if (delta>0) {
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            JOptionPane.showMessageDialog(null, "Resultado da equação do 2 grau\n X1: "+x1+"\nX2: "+x2);
        }else{
            JOptionPane.showMessageDialog(null, "não existem raizes reais");
        }
    }
}

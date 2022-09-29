package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class ClassificTriangulos {
    public static void main(String[] args) {
        int a,b,c;

        a = Integer.parseInt(JOptionPane.showInputDialog("verificador de tipos de um triângulo\ndigite o valor de A:"));

        b = Integer.parseInt(JOptionPane.showInputDialog("verificador de tipos de um triângulo\ndigite o valor de B:"));

        c = Integer.parseInt(JOptionPane.showInputDialog("verificador de tipos de um triângulo\ndigite o valor de C:"));

        if(a<b+c && b<a+c && c<b+a) {
            if((a==b) && (b==c)) {
                JOptionPane.showMessageDialog(null, "é um triângulo equilatero");
            }else if ((a==b) || (b==c) || (c==a)) {
                JOptionPane.showMessageDialog(null, "é um triângulo isosceles");
            }else{
                JOptionPane.showMessageDialog(null, "é um triângulo escaleno");
            }
        }else{
            JOptionPane.showMessageDialog(null,"a forma geométrica descrita não é considerada um triângulo");
            ClassificTriangulos.main(null);
        }
    }
}

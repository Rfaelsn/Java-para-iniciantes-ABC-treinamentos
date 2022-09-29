package com.unidade5;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class VetA_B {
    public static void main(String[] args) {
        double  a [] = new double [10];
        double b [] = new double [10];
        double valor;

        for (int i = 0; i < a.length; i++) {
            valor = Double.parseDouble(JOptionPane.showInputDialog("digite o"+(i+1)+"º valor" ));
            a[i] = valor;
            if (i%2 == 0) {
                b[i] = (2*valor);
            }else{
                b[i] = (valor/2);
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("posição"+(i+1)+"do vetor A: "+a[i]+"|| ");
            System.out.println("posição"+(i+1)+"do vetor B: "+b[i]);
        }
    }
}

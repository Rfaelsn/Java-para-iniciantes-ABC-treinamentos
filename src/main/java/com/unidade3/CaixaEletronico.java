package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CaixaEletronico {
    public static void main(String[] args) {
        int saque;
        double nota10,nota100,nota50,resto;
        saque = Integer.parseInt(JOptionPane.showInputDialog("digite o valor do saque"));
        if (saque%10==0) {
            nota100 = Math.floor(saque/100);
            resto = saque%100;
            nota50 = Math.floor(resto/50);
            resto = resto%50;
            nota10 = Math.floor(resto/10);

            if(nota100>0){
                JOptionPane.showMessageDialog(null, "notas de 100 a sacar: "+nota100);
            }
            if (nota50>0){
                JOptionPane.showMessageDialog(null, "notas de 50 a sacar: "+nota50);
            }
            if (nota10>0) {
                JOptionPane.showMessageDialog(null, "notas de 10 a sacar: "+nota10);
            }
        }else{
            JOptionPane.showMessageDialog(null, "valor inválido digite multiplos de 10");
            CaixaEletronico.main(null);
        }  
    }
}

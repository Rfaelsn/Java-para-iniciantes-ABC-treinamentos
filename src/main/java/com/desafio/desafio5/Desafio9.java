package com.desafio.desafio5;

import javax.swing.JOptionPane;

public class Desafio9 {
    public static void main(String[] args) {
        int saque;
        double nota200,nota100,nota50,nota10,resto;
        saque = Integer.parseInt(JOptionPane.showInputDialog("digite o valor do saque"));
        if (saque%10==0) {
            nota200 = Math.floor(saque/200);
            resto = saque%200;
            nota100 = Math.floor(resto/100);
            resto = resto%100;
            nota50 = Math.floor(resto/50);
            resto = resto%50;
            nota10 = Math.floor(resto/10);

            if(nota200>0){
                JOptionPane.showMessageDialog(null, "notas de 200 a sacar: "+nota200);
            }
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
            Desafio9.main(null);
        }  
    }
}

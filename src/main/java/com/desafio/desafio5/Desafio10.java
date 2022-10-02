package com.desafio.desafio5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio10 {
    public static void main(String[] args) {
        int saque;
        double nota200 = 0, nota100=0 ,nota50 = 0,nota10 = 0,nota2 = 0,resto;
        String opcaoSelecionada;
        List <String> opcaoSaque = new ArrayList<>();

        saque = Integer.parseInt(JOptionPane.showInputDialog("digite o valor do saque"));
        
        if (saque%2==0) {
            opcaoSaque.add("Notas de [50] [10] [2]");

            if((saque>=200) && (saque%50==0)){
                opcaoSaque.add("Notas de [200] [100] [50]");
                
            }
            
            if (saque%10==0) {
                opcaoSaque.add("Notas de [100] [50] [10]");
            }
            

            Object [] opcaoSaqueInput = opcaoSaque.toArray();
        
            opcaoSelecionada = (String) JOptionPane.showInputDialog(
                null, "Seleciona opção de saque",
                null, JOptionPane.QUESTION_MESSAGE, null, 
                opcaoSaqueInput, null
            );

            switch (opcaoSelecionada) {
                case "Notas de [200] [100] [50]" ->{
                    nota200 = Math.floor(saque/200);
                    resto = saque%200;
                    nota100 = Math.floor(resto/100);
                    resto = resto%100;
                    nota50 = Math.floor(resto/50);
                }
                case "Notas de [100] [50] [10]" ->{
                    nota100 = Math.floor(saque/100);
                    resto = saque%100;
                    nota50 = Math.floor(resto/50);
                    resto = resto%50;
                    nota10 = Math.floor(resto/10);
                }
            
                default->{
                    nota50 = Math.floor(saque/50);
                    resto = saque%50;
                    nota10 = Math.floor(resto/10);
                    resto = resto%10;
                    nota2 = Math.floor(resto/2);
                }           
            }


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
            if (nota2>0) {
                JOptionPane.showMessageDialog(null, "notas de 2 a sacar: "+nota2);
            }
        }else{
            JOptionPane.showMessageDialog(null, "valor inválido digite multiplos de 2");
            Desafio9.main(null);
        } 
    }
}

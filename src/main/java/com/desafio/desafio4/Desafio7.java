package com.desafio.desafio4;

import javax.swing.JOptionPane;

public class Desafio7 {
    public static void main(String[] args) {
        int matriz [] [] = new int [3] [3];
        int maiorValor = 0;
        int menorValor = 0;
        int verific;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                verific = Integer.parseInt(
                    JOptionPane.showInputDialog("digite o valor ["+i+"] ["+j+"] da matriz")
                );
                if ((i == 0) && (j==0)) {
                    maiorValor = verific;
                    menorValor = maiorValor;
                    
                }else if(verific > maiorValor) {
                    maiorValor = verific;

                }else if (verific < menorValor) {
                    menorValor = verific;

                }

                matriz[i][j] = verific;
                
            }
        }

        JOptionPane.showMessageDialog(null,"o menor valor digitado na matriz é: "+ menorValor+" e  o maior valor é: "+maiorValor);

    }
}

package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Identificador_Maior_Menor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
        int maiorValor = numero;
        int menorValor = numero;

        for(int i=2; i<10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));

            if(numero>maiorValor){
                maiorValor = numero;
            }else if (numero < menorValor) {
                menorValor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "o maior valor digitado foi: "+maiorValor+"\nO menor valor digitado foi: "+menorValor);
    }
}

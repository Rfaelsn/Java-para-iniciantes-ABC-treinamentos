package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class VerificPar 
{
    public static void main( String[] args )
    {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número para verificar se ele é par ou impar"));

        if(numero%2 ==  0){
            JOptionPane.showMessageDialog(null,"o número "+numero+" é par");
        }

    }
}

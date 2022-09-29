package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class RaizExata 
{
    public static void main( String[] args )
    {
        int numero;
        double raiz_exata,maior_valor;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número para calcular a raiz quadrada"));

        raiz_exata = Math.sqrt(numero);
        maior_valor = Math.ceil(raiz_exata);

        if(raiz_exata == maior_valor){
            JOptionPane.showMessageDialog(null, "existe raiz exata para o valor "+ numero+"\n o valor da raiz é: "+ raiz_exata);
        }

    }
}

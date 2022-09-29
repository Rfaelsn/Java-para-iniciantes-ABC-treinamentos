package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CalcMediaWhile {
    public static void main(String[] args) {
        int valor;
        int cont = 0;
        float soma_media = 0;
        boolean continuar = true;
        String [] opcoes = {"sim","finalizar"};

        while (continuar) {
            valor = Integer.parseInt(
                JOptionPane.showInputDialog("digite o "+(cont+1)+"º valor da média")
            );
            soma_media += valor;
            cont++;
            continuar = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um valor no calculo da média ?", "titulo",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
            )  == JOptionPane.YES_OPTION;

        }

        JOptionPane.showMessageDialog(
            null, "o valor da média é entre os "+cont+" elementos é: "+(soma_media/cont)
        );
    }
}

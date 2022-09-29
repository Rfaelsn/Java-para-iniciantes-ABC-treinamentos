package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MenorValorDoWhile {
    public static void main(String[] args) {
        String opcoes [] = {"sim","não"};
        boolean continuar = true;
        float valor = Float.parseFloat(JOptionPane.showInputDialog("digite um valor"));
        float menor_valor = valor;
        float maior_valor = valor;

        do{
            if (valor < menor_valor) {
                menor_valor = valor;
            }else if (valor > maior_valor) {
                maior_valor = valor;
            }
            continuar = JOptionPane.showOptionDialog(
                null, "deseja continuar ?", "verific.menor",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
                )  == JOptionPane.YES_OPTION;
            if (continuar != false) {
                valor = Float.parseFloat(JOptionPane.showInputDialog("digite outro valor"));
            }
        }while (continuar);

        JOptionPane.showMessageDialog(null, "o menor valor digitado foi: "+menor_valor+"\n e o maior valor é: "+maior_valor);


    }
}

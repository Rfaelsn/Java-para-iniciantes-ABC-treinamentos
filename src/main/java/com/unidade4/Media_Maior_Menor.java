package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Media_Maior_Menor {
    public static void main(String[] args) {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("digite um valor"));
        float maior_valor = valor;
        float menor_valor = valor;
        float media = valor;
        boolean continuar = true;
        String opcoes [] = {"sim","não"};
        int contElementos = 1;

        while (continuar) {
            valor = Float.parseFloat(JOptionPane.showInputDialog("digite outro valor"));
            if (valor > maior_valor){
                maior_valor = valor;
            }else if (valor < menor_valor){
                menor_valor = valor;
            }
            media += valor;
            contElementos++;
            continuar = JOptionPane.showOptionDialog(
                null, "deseja continuar ?", "verific.menor",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
                )  == JOptionPane.YES_OPTION;
        }

        media = (media/contElementos);

        JOptionPane.showMessageDialog(
            null, "a média dos valores digitados é igual a : "+media+"\nmaior valor digitado: "+maior_valor+"\nmenor valor digitado: "+menor_valor
        );
    }
}

package com.aovivo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CalcRestaurante {
    public static void main(String[] args) {
        Integer[] options = {15,18,22};
        float taxaGorjeta, conta, contaTot;

        conta = Float.parseFloat(JOptionPane.showInputDialog("informe o valor da Refeição:"));

        taxaGorjeta = (Integer)JOptionPane.showInputDialog(
            null, "Selecionar taxa de gorjeta",
            null, JOptionPane.QUESTION_MESSAGE, null, 
            options, null
        );
        
        contaTot = conta + (taxaGorjeta/100*conta);
        JOptionPane.showMessageDialog(null,"O valor total da Refeição é de: "+ contaTot);    

    }
}

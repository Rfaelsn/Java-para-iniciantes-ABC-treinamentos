package com.unidade2;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Calc_lanHouse {
    public static void main(String[] args) {
        //constantes
        final int preco_15min = 2;
        //
        //variaveis
        double hr_cliente,min_cliente,tot_preco;
        //
        hr_cliente = Double.parseDouble(JOptionPane.showInputDialog("digite o total de horas"));
        min_cliente = Double.parseDouble(JOptionPane.showInputDialog("digite o total de min"));

        tot_preco = (Math.ceil(((hr_cliente*60)+min_cliente)/15))*preco_15min;

        JOptionPane.showMessageDialog(null, "o total apagar é: "+tot_preco+"R$");
    }
}

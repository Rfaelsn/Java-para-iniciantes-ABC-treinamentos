package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class ConverteMoeda {
    public static void main(String[] args) {
        int tipoMoeda;
        double valorReal;

        valorReal = Double.parseDouble(JOptionPane.showInputDialog("digite o valor que vovê deseja converter"));

        tipoMoeda = Integer.parseInt(JOptionPane.showInputDialog("selecione para qual moeda você deseja converter o valor "+valorReal+"\n(1)Libra\n(2)Dólar\n(3)Euro"));

        switch (tipoMoeda) {
            case 1:
                JOptionPane.showMessageDialog(null, "valor em libra: "+(valorReal/5));
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "valor em dolar: "+(valorReal/4));
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "valor em dolar: "+(valorReal/4.4));
                break;

            default:
                JOptionPane.showMessageDialog(null, "valor invalido");
                break;
        }
    }
}

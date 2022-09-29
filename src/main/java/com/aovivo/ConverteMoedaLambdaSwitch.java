package com.aovivo;

import javax.swing.JOptionPane;

public class ConverteMoedaLambdaSwitch {
    public static void main(String[] args) {
        int tipoMoeda;
        double valorReal;

        valorReal = Double.parseDouble(JOptionPane.showInputDialog("digite o valor que vovê deseja converter"));

        tipoMoeda = Integer.parseInt(JOptionPane.showInputDialog("selecione para qual moeda você deseja converter o valor "+valorReal+"\n(1)Libra\n(2)Dólar\n(3)Euro"));

        JOptionPane.showMessageDialog(null,switch(tipoMoeda){
            case 1 -> valorReal/5;
            case 2 -> valorReal/4;
            case 3 -> valorReal/4.4;
            default -> "Opação digitada incorreta";
        });
    }
}

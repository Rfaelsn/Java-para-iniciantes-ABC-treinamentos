package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class CalcContas {
    public static void main(String[] args) {
        String nome_conta = JOptionPane.showInputDialog("digite a descrição da conta");
        String nome_maior_conta = nome_conta;
        String nome_menor_conta = nome_conta;
        float valor_Conta = Float.parseFloat(JOptionPane.showInputDialog("digite o valor"));
        float maior_conta = valor_Conta;
        float menor_conta = valor_Conta;
        float tot_conta = valor_Conta;
        boolean continuar = true;
        String opcoes [] = {"sim","não"};
        int contContas = 1;

        while (continuar) {
            nome_conta = JOptionPane.showInputDialog("digite a descrição da conta");
            valor_Conta = Float.parseFloat(JOptionPane.showInputDialog("digite o valor"));
            if (valor_Conta > maior_conta){
                maior_conta = valor_Conta;
                nome_maior_conta = nome_conta;
            }else if (valor_Conta < menor_conta){
                menor_conta = valor_Conta;
                nome_menor_conta = nome_conta;
            }
            tot_conta += valor_Conta;
            contContas++;
            continuar = JOptionPane.showOptionDialog(
                null, "deseja continuar ?", "calculadora de contas",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
            )  == JOptionPane.YES_OPTION;
        }

        JOptionPane.showMessageDialog(
            null, "o total a pagar é: "+tot_conta+"\nmaior conta a pagar: \n"+nome_maior_conta+" valor: "+maior_conta+"\nmenor conta a pagar: \n"+nome_menor_conta+" valor: "+menor_conta+"\n numero total de contas a pagar: "+contContas
        );
    }
}

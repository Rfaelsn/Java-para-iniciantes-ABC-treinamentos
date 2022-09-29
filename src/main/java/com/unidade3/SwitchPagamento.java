package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class SwitchPagamento {
    public static void main(String[] args) {
        double valorProduto,valorFinal;
        int opPagamento;

        valorProduto = Double.parseDouble(JOptionPane.showInputDialog("digite o valor a pagar"));
        opPagamento = Integer.parseInt(JOptionPane.showInputDialog("selecione a opção de pagamento:\n(1)dinheiro ou cheque (10% desconto)\n(2) avista cartão de crédito (5% desconto)\n(3) 2 vezes sem juros\n(4) 3 vezes (10% de juros) "));

        switch (opPagamento) {
            case 1:
                valorFinal = (valorProduto*0.9);
                JOptionPane.showMessageDialog(null,"total a pagar é "+valorFinal);
                break;
        
            case 2:
                valorFinal = (valorProduto*0.95);
                JOptionPane.showMessageDialog(null,"total a pagar é "+valorFinal);
                break;

            case 3:
                valorFinal = (valorProduto/2);
                JOptionPane.showMessageDialog(null,"total das parcelas a pagar é "+valorFinal);
                break;

            case 4:
                valorFinal = (valorProduto*1.1)/3;
                JOptionPane.showMessageDialog(null,"total das parcelas a pagar é "+valorFinal);
                break;

            default:
                JOptionPane.showMessageDialog(null,"opção incorreta");
                SwitchPagamento.main(null);
                break;
        }
    }
}

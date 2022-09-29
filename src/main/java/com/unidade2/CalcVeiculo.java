package com.unidade2;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class CalcVeiculo {
    public static void main(String[] args) {
        //variaveis
        String modelo;
        double preco_veiculo,entrada,valor_parcela;
        //
        JOptionPane.showMessageDialog(null, "simulador de compra de veiculos");
        modelo = JOptionPane.showInputDialog("digite o modelo do veículo");
        preco_veiculo = Double.parseDouble(JOptionPane.showInputDialog("digite o preço do veiculo"));
        entrada = (preco_veiculo*0.5);
        valor_parcela = (preco_veiculo-entrada)/12;
        JOptionPane.showMessageDialog(null, "Resultado da simulação do veiculo "+modelo+": \n entrada: "+entrada+"\n valor das parcelas com a respectiva entrada: "+valor_parcela);
    }
}

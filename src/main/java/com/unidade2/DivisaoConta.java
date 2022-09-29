package com.unidade2;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class DivisaoConta 
{
    public static void main( String[] args )
    {
        //variaveis
            int pessoas = 0;
            double conta,div_conta;
        //
        JOptionPane.showMessageDialog(null,"software divisor de contas");
        conta = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o total da conta"));
        pessoas = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero de pessoas que irão dividir a conta"));
        div_conta = (conta/pessoas);
        JOptionPane.showMessageDialog(null,"a conta para cada sairá a "+ div_conta +"R$");
    }
}

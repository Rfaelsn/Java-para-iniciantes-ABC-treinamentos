package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Natacao 
{
    public static void main( String[] args )
    {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("para saber a classificação de nadador digite sua idade"));
        if (idade >=0 && idade <= 150) {
            if (idade>=18) {
                JOptionPane.showMessageDialog(null,"nadador adulto");
            }else if (idade >= 14) {
                JOptionPane.showMessageDialog(null,"classificação juvenil B");
            }else if (idade >= 12){
                JOptionPane.showMessageDialog(null,"classificação juvenil A");
            }else if(idade >= 9){
                JOptionPane.showMessageDialog(null,"classificação infantil C");
            }else  if (idade >= 6 ){
                JOptionPane.showMessageDialog(null,"classificação infantil B");
            }else if (idade >= 0){
                JOptionPane.showMessageDialog(null,"classificação infantil A");
            }
        }else{
            JOptionPane.showMessageDialog(null,"idade inválida");
            Natacao.main(null);
        }
    }
}

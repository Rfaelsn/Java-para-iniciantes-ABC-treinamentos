package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Classific_0_100 
{
    public static void main( String[] args )
    {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite sua nota de de 0 a 100"));

        if (numero >=0 && numero <= 100) {
            if (numero>=90) {
                JOptionPane.showMessageDialog(null,"nota Excelente");
            }else if (numero >=70) {
                JOptionPane.showMessageDialog(null,"nota Bão");
            }else if (numero >=50) {
                JOptionPane.showMessageDialog(null,"nota Regular");
            }else{
                JOptionPane.showMessageDialog(null,"nota insuficiente");
            }
        }else{
            JOptionPane.showMessageDialog(null,"nota inválida");
            Classific_0_100.main(null);
        }
    }
}

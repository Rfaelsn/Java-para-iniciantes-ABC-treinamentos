package com.unidade2;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class CalcDescont 
{
    public static void main( String[] args )
    {
        //contante
        final double descontAvista = 0.1;
        //variaveis
        double valorProd,valorAvista,valorParc3;    
        //
        valorProd = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o preço total do produto"));
        valorAvista = valorProd-(valorProd*descontAvista); //ou podemos multiplicar por 0.9 ja que é o resto tirando os 0.1
        valorParc3 = (valorProd/3);
        JOptionPane.showMessageDialog(null,"valor do produto avista: " + valorAvista + "valor das parcelas (3x sem juros): " + valorParc3);


    }
}

package com.unidade2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calc_jantar 
{
    public static void main( String[] args )
    {
        final double taxaGarcon = 0.1;
        double valor_jantar = 0,valor_jantarTot = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor total do seu jantar para calcular a gorjeta do garçon");
        valor_jantar = teclado.nextDouble();
        valor_jantarTot = valor_jantar+(valor_jantar*taxaGarcon);
        System.out.println("o valor total a pagar é " + valor_jantarTot);

    }
}

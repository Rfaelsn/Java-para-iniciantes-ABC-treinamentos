package com.unidade2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Dobro 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu número");
        double numero = teclado.nextDouble();
        double dobro = (numero * 2);
        System.out.println("o dobro do valor digitado é " + dobro);


    }
}

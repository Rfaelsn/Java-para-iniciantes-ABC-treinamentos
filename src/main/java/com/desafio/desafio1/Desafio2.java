package com.desafio.desafio1;

public class Desafio2 {
    public static void main(String[] args) {
        //mesma coisa incrementa de 2 em 2 começando em 2
        int num = 2;
        for (int i = 1; i <= 20; i+=2) {
            System.out.print(num+", ");
            num += i;
        }
    }
}

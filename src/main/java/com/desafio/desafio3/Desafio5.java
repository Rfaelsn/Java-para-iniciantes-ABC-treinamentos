package com.desafio.desafio3;

public class Desafio5 {
    public static void main(String[] args) {   
        int codific = 1;
        char result;
        
        for (char letra = 97; letra <= 122; letra++) {
            if ((letra+codific)>122) {
               result = (char)(((letra+codific) - 122) + 96); 
               
            }else{
                result = (char) (letra+codific);
            }
            System.out.println((letra+" => "+result));
               
        }
    }
}

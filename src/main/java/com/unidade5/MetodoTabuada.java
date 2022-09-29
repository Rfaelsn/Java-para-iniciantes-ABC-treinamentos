package com.unidade5;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MetodoTabuada {
    public static void tabuada(int numero){
        String tabuada="";
        for (int i = 1; i <=10 ; i++) {
            tabuada += numero+" * "+i+" = "+(numero*i)+"\n";
        }
        JOptionPane.showMessageDialog(null,"Tabuada de "+numero+"\n"+tabuada);
    }
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("digite um número para visualizar sua tabuada")
        );

        tabuada(numero);
    }
}

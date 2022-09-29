package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class MostraTabuada {
    public static void main(String[] args) {
        int tabuada,limite;
        String result = "Tabuada\n"; 
        
        tabuada = Integer.parseInt(JOptionPane.showInputDialog("digite a tabuada que você deseja"));
        limite = Integer.parseInt(JOptionPane.showInputDialog("digite o limite da tabuada"));
        for(int i=0;i<=limite;i++){
            result += (tabuada+" x "+i+": "+(tabuada*i)+"\n");
        }
        JOptionPane.showMessageDialog(null, result);
    }
}

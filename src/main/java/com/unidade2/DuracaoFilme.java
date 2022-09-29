package com.unidade2;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class DuracaoFilme {
    public static void main(String[] args) {
        //variaveis
        String nome_filme;
        double horas,minutos,tot_min;
        //
        JOptionPane.showMessageDialog(null,"conversor de duração de filmes em minutos");

        nome_filme = JOptionPane.showInputDialog("digite o nome do filme");
        
        horas = Double.parseDouble(JOptionPane.showInputDialog("digite as horas da duração do filme"));
        
        minutos = Double.parseDouble(JOptionPane.showInputDialog("digite os minutos da duração do filme"));

        tot_min = (horas*60)+minutos;

        JOptionPane.showMessageDialog(null,"o total de minutos do filme "+nome_filme+" é :"+tot_min+"min");



    }
}

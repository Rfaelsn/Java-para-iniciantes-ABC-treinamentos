package com.unidade2;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class Calc_viagem 
{
    public static void main( String[] args )
    {
        int num_dias;
        double horas,tot_viagem_horas;
        JOptionPane.showMessageDialog(null, "Bem vindo ao calculo de tempo de viagem (horas)");
        num_dias= Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero de dias da viagem"));
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "digite as horas de sua viagem"));
        tot_viagem_horas = (num_dias*24)+horas;
        JOptionPane.showMessageDialog(null, "o total de horas de sua viagem é " + tot_viagem_horas);
        
        
    }
}

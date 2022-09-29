package com.unidade3;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class PesoIdeal 
{
    public static void main( String[] args )
    {
        double altura, pesoIdealHomen, pesoIdealMulher;
        String sexo;

        sexo = JOptionPane.showInputDialog("digite seu sexo (M- Masculino) (F- Feminino)");
        altura = Double.parseDouble(JOptionPane.showInputDialog("digite sua altura"));

        if(sexo.equalsIgnoreCase("m")){
            pesoIdealHomen = (altura*72.7)-58;
            JOptionPane.showMessageDialog(null, "(M)Seu peso ideal é: "+pesoIdealHomen);
        }else{
            pesoIdealMulher = (altura*72.7)-44.7;
            JOptionPane.showMessageDialog(null, "(F)Seu peso ideal é: "+pesoIdealMulher);
        }
    }
}

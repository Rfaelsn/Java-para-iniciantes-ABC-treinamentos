package com.unidade2;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class NumAntPost 
{
    public static void main( String[] args )
    {
        //variaveis
            int valor=0; 
        //
        Scanner teclado = new Scanner(System.in);
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um número para ver o seu posterior e anterior"));
        JOptionPane.showMessageDialog(null, "valor anterior ao digitado ("+(valor-1)+") <-("+(valor)+")-> valor posterior("+(valor+1)+")");
    }
}

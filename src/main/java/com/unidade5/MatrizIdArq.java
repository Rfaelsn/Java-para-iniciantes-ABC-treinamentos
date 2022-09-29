package com.unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class MatrizIdArq {
    public static void main(String[] args) throws IOException {
        int matriz_identidade [][] = new int [3] [3];

        FileWriter arq = new FileWriter("matriz_identidade.txt");
        PrintWriter grava_arq = new PrintWriter(arq);

        for (int i = 0; i < matriz_identidade.length; i++) {
            grava_arq.print("|");

            for (int j = 0; j < matriz_identidade.length; j++) {

                if (i == j) {
                    matriz_identidade[i][j] = 1;
                }else{
                    matriz_identidade[i][j] = 0;
                }

                grava_arq.print(matriz_identidade[i][j]+" ");
            }

            grava_arq.print("|\n");
        }

        grava_arq.close();
        arq.close();
    
    }
}

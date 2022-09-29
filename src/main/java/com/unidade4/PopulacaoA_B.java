package com.unidade4;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class PopulacaoA_B {
    public static void main(String[] args) {
        int selectMenu = 0;
        String [] opcoesMenu = {"A passar B","B passar A","B = A","finalizar"};
        boolean a_maior_b = false;
        boolean b_maior_a = false;
        boolean a_igual_b = false;
        boolean continuar = true;

        double habitantesA = Double.parseDouble(
            JOptionPane.showInputDialog("digite o numero de habitantes do país A")
        );

        double taxaA = Double.parseDouble(
            JOptionPane.showInputDialog("digite a taxa de natalidade do país A")
        );

		double habitantesB = Double.parseDouble(
            JOptionPane.showInputDialog("digite o numero de habitantes do país B")
        );

		double taxaB = Double.parseDouble(
            JOptionPane.showInputDialog("digite a taxa de natalidade do país B")
        );

        int tempo = 0;
        double populacaoA = habitantesA;
        double populacaoB = habitantesB;

        selectMenu = JOptionPane.showOptionDialog(
            null, "realizar analse quando:",
            "Selecione uma oção",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            null, opcoesMenu, opcoesMenu[0]
        );
		
		switch (selectMenu) {
            case 0 -> a_maior_b = true;
            case 1 -> b_maior_a = true;
            case 2 -> a_igual_b = true;
            default -> JOptionPane.showMessageDialog(null, "finalizado !");
        }
        
		while(continuar = true){
			populacaoB = populacaoB + populacaoB*taxaB;
			populacaoA = populacaoA + populacaoA*taxaA;
			tempo++;

            if (a_maior_b) {
                if ((populacaoA > populacaoB) && (taxaA > taxaB)) {
                    JOptionPane.showMessageDialog(null, "a população de A demorou "+tempo+"anos para passar a população de B");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "não foi possivel realizar esta analise com a taxa"+taxaA+" e população inicial "+habitantesA+"não será possivel A ultrapassar valores de B:\ntaxa:"+taxaA+"\nPopulação inicial A:"+habitantesA );
                    break;
                }
            }else if (b_maior_a) {
                if ((populacaoB > populacaoA) && (taxaA > taxaB)) {
                    JOptionPane.showMessageDialog(null, "a população de B demorou "+tempo+"anos para passar a população de A");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "não foi possivel realizar esta analise com a taxa"+taxaB+" e população inicial "+habitantesB+"não será possivel B ultrapassar valores de A:\ntaxa:"+taxaA+"\nPopulação inicial A:"+habitantesA );
                    break;
                }
            }else if (a_igual_b) {
                if (populacaoA == populacaoB) {
                    JOptionPane.showMessageDialog(null, "a população de A demorou "+tempo+"anos para passar a população de B");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "com os valores informados A e B não serão iguais em nenhum momento");
                }
            }
		}
    }
}

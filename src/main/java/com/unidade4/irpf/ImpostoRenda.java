package com.unidade4.irpf;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class ImpostoRenda {
    public static void main(String[] args) {
        boolean continuar = true;
        boolean continuarMenu = true;
        String nome,cpf,result_consulta ="";
        String [] opcoes = {"sim","não"};
        String [] opcoresMenu = {"Cadastrar", "Consultar", "Atualizar", "Deletar","Finalizar execução" };
        String [] optionsEdit = {"Nome","Cpf","Número de dependentes","IRPF"};
        String selecao_menu_edit="";
        int numDependentes,selectMenu;
        double rendaLiquida,rendaMensal;
        double irpf = 0.0;
        List <Contribuinte> contribuintes =  new ArrayList<>();

        while (continuarMenu) {
            selectMenu = JOptionPane.showOptionDialog(null, "Selecione a opção desejada",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoresMenu, opcoresMenu[0]);
            switch (selectMenu) {
                case 0:
                    while (continuar) {
                        nome = JOptionPane.showInputDialog("digite o nome do contribuinte");
                        cpf = JOptionPane.showInputDialog("digite o CPF do contribuinte");
            
                        numDependentes = Integer.parseInt(
                            JOptionPane.showInputDialog("digite o numero de dependentes do contribuinte")
                        );
            
                        rendaMensal = Double.parseDouble(
                            JOptionPane.showInputDialog("digite a renda liquida do contribuinte")
                        );
        
                        rendaLiquida =  rendaMensal - (numDependentes*188.59)-(rendaMensal*0.11);
                        
                        if ((rendaLiquida>=1903.99) && (rendaLiquida<=2826.65)) {
                            irpf = (rendaLiquida*0.075)-142.80;

                        }else if ((rendaLiquida>=2826.66) && (rendaLiquida<=3751.05)) {
                            irpf = (rendaLiquida*0.15)-354.80;

                        }else if ((rendaLiquida>=3751.06) && (rendaLiquida<=4464.68)) {
                            irpf = (rendaLiquida*0.225)-636.13;
            
                        }else if (rendaLiquida>4464.68) {
                            irpf = (rendaLiquida*0.275)-869.36; 
                        }

                        if(irpf == 0) {
                            JOptionPane.showMessageDialog(
                                null,
                                "o contribuinte "+nome+" é insento de imposto de renda"
                            );
                        }else{
                            JOptionPane.showMessageDialog(
                                null,
                                "o contribuinte "+nome+" tem "+irpf+" de imposto de renda"
                            );
                        }
                        contribuintes.add(new Contribuinte(nome, cpf, numDependentes, irpf));
            
                        continuar = JOptionPane.showOptionDialog(
                            null, "deseja continuar ?", "verific.menor",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
                        )  == JOptionPane.YES_OPTION;
                    }
                break;

                case 1:
                    cpf = JOptionPane.showInputDialog(
                        "digite o cpf do contribuinte que deseja acessar"
                    );

                    for (Contribuinte contribuinte : contribuintes) {
                        if (contribuinte.getCpf().equals(cpf)) {
                            result_consulta = "contribuinte:\nnome:"+contribuinte.getNome()+"\n cpf:"+contribuinte.getCpf()+"\nnumDependentes: "+contribuinte.getNumDependentes()+"\n IRPF: "+contribuinte.getIrpf();
                        }
                    }

                    if (result_consulta != "") {
                        JOptionPane.showMessageDialog(null,result_consulta);
                    }else{
                        JOptionPane.showMessageDialog(null,"cadastro não encontrado");
                    }
                break;

                case 2:
                    cpf = JOptionPane.showInputDialog(
                        "digite o cpf do contribuinte que deseja acessar"
                    );

                    for (Contribuinte contribuinte : contribuintes) {
                        if (contribuinte.getCpf().equals(cpf)) {
                            selecao_menu_edit = (String) JOptionPane.showInputDialog(
                            null, "Selecione:",
                            null, JOptionPane.QUESTION_MESSAGE, null, 
                            optionsEdit, null
                            );

                            switch (selecao_menu_edit) {
                                case "Nome":
                                    nome =JOptionPane.showInputDialog(
                                        "digite o novo valor de "+selecao_menu_edit
                                    );
                                    contribuinte.setNome(nome);
                                break;
        
                                case "Cpf":
                                    cpf = JOptionPane.showInputDialog(
                                        "digite o novo valor de "+selecao_menu_edit
                                    );
                                break;
        
                                case "Número de dependentes":
                                    numDependentes = Integer.parseInt(
                                        JOptionPane.showInputDialog("digite o novo valor de "+selecao_menu_edit)
                                    );
                                    
                                break;
        
                                case "IRPF":
                                    irpf = Double.parseDouble(
                                        JOptionPane.showInputDialog("digite o novo valor de "+selecao_menu_edit)
                                    );
                                break;
                            }
                        }
                    }
                    if (selecao_menu_edit.equals("")) {
                        JOptionPane.showMessageDialog(null,"Registro não encontrado");
                    }
                break;

                case 3:
                    cpf = JOptionPane.showInputDialog(
                        "digite o cpf do contribuinte que deletar"
                    );
                    for (Contribuinte contribuinte : contribuintes) {
                        if (contribuinte.getCpf().equals(cpf)) {
                            contribuintes.remove(contribuinte);
                            JOptionPane.showMessageDialog(
                                null, "Registro apagado com sucesso !"
                            );
                        }
                    }
                break;

                case 4:
                    continuarMenu = false;    
                break;
            
            }
            
        }

    }
}

package com.unidade4.irpf;

public class Contribuinte {
    String nome,cpf;
    int numDependentes;
    double irpf;


    public Contribuinte(String nome, String cpf, int numDependentes, double irpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.numDependentes = numDependentes;
        this.irpf = irpf;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumDependentes() {
        return this.numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public double getIrpf() {
        return this.irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

   
    
    

}

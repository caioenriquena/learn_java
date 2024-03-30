package nota_de_aula_1;

import javax.swing.*;

public class Funcionario {

    String nome ;
    double salario,liquido,deducao;
    int matricula;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }

    public void salarioDeducao(){
        deducao  =  salario*0.15;
        JOptionPane.showMessageDialog(null,"A dedução do INSS :" + deducao);

    }



    public void  salarioLiquido(){
        liquido = salario  -  deducao;
        JOptionPane.showMessageDialog(null,"O salario liquido é  : " + liquido);
    }
}

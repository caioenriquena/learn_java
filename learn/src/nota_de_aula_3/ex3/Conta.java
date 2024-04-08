package nota_de_aula_3.ex3;

import javax.swing.*;

public class Conta {
    private String nomeTitular= "Lucas Barroso";
    protected double saldo  ;
    protected double sacar;
    private double depositar;

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public void sacarvalor (){
        if ( saldo >=sacar){
            saldo = saldo-sacar;
            JOptionPane.showMessageDialog(null, "Saque realizado");
        }

         else  {
            JOptionPane.showMessageDialog(null, "Saque não pode ser realizado : saldo insuficiente");

        }

    }
    public void depositarvalor() {
        saldo = depositar+saldo;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso ");
    }

    public void dadosConta(){
        JOptionPane.showMessageDialog(null, "Nome do titular da conta : " + nomeTitular + "Saldo da conta  :" + saldo);
    }
}


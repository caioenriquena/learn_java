package nota_de_aula_3.ex3;

import javax.swing.*;

public class contaCorrente extends Conta {
    double cheque = 1000;
    double saque;
    String controle;
    public double getCheque() {
        return cheque;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }
    @Override
    public void sacarvalor (){
        if ( saldo >=sacar){
            saldo = saldo-sacar;
            JOptionPane.showMessageDialog(null, "Saque realizado");
        } else if (saldo <sacar) {
            var opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja utilizar o cheque especial?" + """
                        Menu Cheque:
                        1. Sim
                        2. Não
                      
                                             
                        """));
            if(opcao==1){
                if(saldo < -1000 || saldo - sacar < -1000){
                    JOptionPane.showMessageDialog(null,"Você utilizou o valor total do cheque especial");
                }else {
                    saldo = saldo -sacar;
                    System.out.println(saldo);
                    JOptionPane.showMessageDialog(null,"Saque realizado utilizando cheque especial");
                }
            }
        }

        else  {
            JOptionPane.showMessageDialog(null, "Saque não pode ser realizado : saldo insuficiente");

        }

    }
}
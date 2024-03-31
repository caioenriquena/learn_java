package nota_de_aula_3.ex3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        contaCorrente cc = new contaCorrente();
        contaPoupanca cp = new contaPoupanca();
        int opcaoConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de conta (1: conta corrente || 2 : conta poupança)"));
        switch (opcaoConta) {
            case 1:
                JOptionPane.showMessageDialog(null, "Nome do titular da conta : " + cc.getNomeTitular());
                JOptionPane.showMessageDialog(null, "Conta corrente selecionada");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Nome do titular da conta : " + cp.getNomeTitular());
                JOptionPane.showMessageDialog(null, "Conta poupança selecionada");
                break;
        }
        int opcao = 0;
        if (opcaoConta == 1) {
            opcao = -1;

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        Menu Conta:
                        1. Depositar
                        2. Sacar
                        3. Exibir Dados da Conta
                        0. SAIR
                                                
                        """));
                switch (opcao) {
                    case 1:
                        cc.setDepositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser despositado : ")));
                        cc.depositarvalor();
                        System.out.println(cc.getDepositar());
                        break;
                    case 2:
                        cc.setSacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a sacar : ")));
                        cc.sacarvalor();
                        break;
                    case 3:
                        cc.dadosConta();
                        break;


                    default:

                        break;
                }

            } while (opcao != 0);
        } else {

            int opcao2 = -1;

            do {
                opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        Menu Conta Poupança:
                        1. Depositar
                        2. Sacar
                        3. Exibir Dados da Conta
                        4. Exibir rendimentos
                        0. SAIR
                                                
                        """));
                switch (opcao2) {
                    case 1:
                        cp.setDepositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser despositado : ")));
                        cp.depositarvalor();
                        break;
                    case 2:
                        cp.setSacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a sacar : ")));
                        cp.sacarvalor();
                        break;
                    case 3:
                        cp.dadosConta();
                        break;
                    case 4:
                        cp.taxaRendimento();
                        break;

                    default:

                        break;
                }

            } while (opcao != 0);
        }


    }




}

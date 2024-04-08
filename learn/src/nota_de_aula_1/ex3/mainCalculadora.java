package nota_de_aula_1.ex3;

import javax.swing.*;

public class mainCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int i, resposta, n1, n2;

        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 : p/ Adição || 2 p/ Subtração || 3 p/  Divisão || 4 p/ Multiplicação"));
            switch (resposta) {
                case 1:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número da operação"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo  número da operação"));
                    JOptionPane.showMessageDialog(null, c.somar(n1, n2));
                    break;
                case 2:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número da operação"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo  número da operação"));
                    JOptionPane.showMessageDialog(null, c.subtracao(n1, n2));
                    break;
                case 3:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número da operação"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo  número da operação"));
                    JOptionPane.showMessageDialog(null, c.divisao(n1, n2));
                    break;
                case 4:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número da operação"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo  número da operação"));
                    JOptionPane.showMessageDialog(null, c.multiplicacao(n1, n2));
                    break;
                default:
                    break;
            }

            i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 0 para sair  e 1 p/ continuar"));
        }while (i==1);

    }
}
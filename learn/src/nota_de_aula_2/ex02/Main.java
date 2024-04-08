package nota_de_aula_2.ex02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setQnt_Atual((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quatidade no estoque"))));
        e.setQnt_Maxima((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quatidade máxima no estoque"))));
        e.setQnt_Minima((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quatidade mínima no estoque"))));
        e.calcula_Media();
    }
}

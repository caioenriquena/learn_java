package nota_de_aula_2.ex01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Maca m = new Maca();
        m.setQuantidade(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quatidade de maçãs")));
        m.calcularValor();

    }
}

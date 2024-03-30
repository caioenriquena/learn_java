package nota_de_aula_2.ex03;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setL1(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o lado 1 do triangulo :")));
        t.setL2(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o lado 2 do triangulo :")));
        t.setL3(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o lado 3 do triangulo :")));
        t.tipoTriangulo();
    }
}

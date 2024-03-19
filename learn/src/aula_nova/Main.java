package aula_nova;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        Carro c = new Carro("Fiat","Uno",2024);

        Carro c2 = new Carro("Fiat","Bravo");


        JOptionPane.showMessageDialog(null,"O ano do carro é : " + c.getAno());

        c.setMarca(JOptionPane.showInputDialog("Qual o nome da nova marca? "));

        JOptionPane.showMessageDialog(null,"A nova marca é : " + c.getMarca());
    }
}

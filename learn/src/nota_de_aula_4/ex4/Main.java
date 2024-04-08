package nota_de_aula_4.ex4;

import javax.swing.*;

class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        JOptionPane.showMessageDialog(null,"Exibir informações do Leão !");
        leao.exibirInformacoes();

        JOptionPane.showMessageDialog(null,"Exibir informações da ARARA : " +arara.getClasse());

        JOptionPane.showMessageDialog(null,"Locomoção : " +arara.getLocomocao());
        JOptionPane.showMessageDialog(null,"Quantidade de ovos :" + arara.getQtdeOvos());
    }
}

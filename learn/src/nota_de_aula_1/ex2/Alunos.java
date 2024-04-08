import javax.swing.*;

public class Alunos {

    public static void main(String[] args) {
        calculadoraMedia c = new calculadoraMedia();

        c.setNome(JOptionPane.showInputDialog("Informe o nome do aluno"));
        c.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 do aluno !")));
        c.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 do aluno !")));
        c.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3 do aluno !")));
        c.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4 do aluno !")));


        c.calcularMedia();

    }
}

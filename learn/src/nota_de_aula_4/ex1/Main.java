package nota_de_aula_4.ex1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Caio",27,202212);
        Professor p = new Professor("LUCAS",35,3000);


        JOptionPane.showMessageDialog(null,"O nome do professor é : "+p.getNome());
        JOptionPane.showMessageDialog(null,"O salario do professor  é : "+p.getSalario());
        JOptionPane.showMessageDialog(null,"O nome do Aluno  é : "+a.getNome());
        JOptionPane.showMessageDialog(null,"A matricula do aluno  é : "+a.getMatricula());
    }

}

package ex3;

import javax.crypto.spec.PSource;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Joao",45,1412.00);
        Aluno a = new Aluno("Caio",27,2023206);

        JOptionPane.showMessageDialog(null, "O nome do aluno e suas informações são : " + "Nome : " + a.getNome() + ", " + " Idade : " + a.getIdade() +" " + " Matricula : "+ a.getMatricula());
        JOptionPane.showMessageDialog(null, "O nome do professor e suas informações são : " + "Nome : " + p.getNome() + ", " + " Idade : " + p.getIdade() +" " + " Salario : "+ p.getSalario());


    }





}

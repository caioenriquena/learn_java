package nota_de_aula_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe seu nome : "));
        f.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe sua matrícula : ")));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Olá informe seu salário  :  ")));

        JOptionPane.showMessageDialog(null,"A matrícula  é  : "+ f.getMatricula());
        JOptionPane.showMessageDialog(null,"Nome : " + f.getNome());
        JOptionPane.showMessageDialog(null,"Salário bruto : " +f.getSalario());
        f.salarioDeducao();
        f.salarioLiquido();
    }
}

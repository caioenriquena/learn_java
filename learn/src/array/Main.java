package array;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        CadastroPessoas cp = new CadastroPessoas();
        PessoaFisica pf = new PessoaFisica();

       /* p.setNome(JOptionPane.showInputDialog(null, "Informe seu nome :"));
        p.setIdade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua idade :")));

        cp.cadastrarPessoa(p);
        cp.listar(); */

        pf.setNome(JOptionPane.showInputDialog(null, "Digite o nome da Pessoa Física :"));
        pf.setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF : "));
        pf.setIdade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua idade :")));
        cp.cadastrarPessoa(pf);

        cp.listarPolimorficos();


    }
}
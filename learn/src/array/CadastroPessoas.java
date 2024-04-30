package array;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    private ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

    private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        JOptionPane.showMessageDialog(null, "Pessoa Cadastrada com sucesso !");
    }

    public void cadastrarPessoaFisica(PessoaFisica pf) {
        pessoasFisicas.add(pf);
        JOptionPane.showMessageDialog(null, "Cadastro de Pessoa física realizado com sucesso!");
    }

    public void cadastrarPessoaJuridica(PessoaJuridica pj) {
        pessoasJuridicas.add(pj);
        JOptionPane.showMessageDialog(null, "Cadastro de Pessoa juridica realizado com sucesso!");
    }

    public void listar() {
        for (Pessoa p : pessoas) {
            JOptionPane.showMessageDialog(null, "Nome : " + p.getNome() + " Idade : " + p.getIdade());
        }
    }




    public void listarPolimorficos() {
        ArrayList<Pessoa> pessoasPolimorficas = new ArrayList<>();
        pessoasPolimorficas.addAll(pessoasFisicas);
        pessoasPolimorficas.addAll(pessoasJuridicas);

        for (Pessoa p : pessoasPolimorficas) {
            if (p instanceof PessoaFisica) {
                JOptionPane.showMessageDialog(null, "Nome : " + p.getNome() + " Idade : " + p.getIdade() + " CPF : " + ((PessoaFisica) p).getCpf());

            } else if (p instanceof PessoaJuridica) {
                JOptionPane.showMessageDialog(null, "Nome: " + p.getNome() + " Idade:" + p.getIdade() + " CNPJ:" + ((PessoaJuridica) p).getCnpj());

            } else {
                JOptionPane.showMessageDialog(null, "Nome:" + p.getNome() + ", Idade:" + p.getIdade());

            }
        }

    }
}

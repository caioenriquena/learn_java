package learn_abstract;

import javax.swing.*;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome,int idade ){

        this.nome= nome;
        this.idade= idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Eu emito som");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

package learn_abstract;

import javax.swing.*;

public abstract class Animal {
    protected String nome;
    protected int idade;
    private final tipoAnimal tipo;
    public Animal(String nome,int idade ,tipoAnimal tipo){

        this.nome= nome;
        this.idade= idade;
        this.tipo =tipo;
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

    public  void comer(){JOptionPane.showMessageDialog(null,"Comendo !");}

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipo=" + tipo +
                '}';
    }
}

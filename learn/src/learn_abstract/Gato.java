package learn_abstract;

import javax.swing.*;

public class Gato extends Animal implements Corrida {
    public Gato(String nome, int idade, tipoAnimal tipo) {
        super(nome, idade, tipo);
    }

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Miau Miau!");
    }

    @Override
    public void correr(){
        JOptionPane.showMessageDialog(null,"Correndo muito rapido miau !");
    }
    @Override
    public  void comer(){JOptionPane.showMessageDialog(null,"Comendo Miauu!");}
}

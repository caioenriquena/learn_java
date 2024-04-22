package learn_abstract;

import javax.swing.*;

public class Cachorro extends Animal implements Corrida{
    public Cachorro(String nome, int idade, tipoAnimal tipo) {
        super(nome, idade,tipo);
    }

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Au Au!!");
    }

    @Override
    public void correr(){
        JOptionPane.showMessageDialog(null,"Estou correndo muito auuuuuuuuuuuu!");
    }

    @Override
    public  void comer(){JOptionPane.showMessageDialog(null,"Comendo au au!");}

}


package learn_abstract;

import javax.swing.*;

public class Passarinho extends Animal implements Corrida , Voar{
    public Passarinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Assovio de passaro");
    }
    @Override
    public void correr(){
        JOptionPane.showMessageDialog(null,"Eu não posso correr, mas posso VOAR!!");
    }

    @Override
    public void voando(){
        JOptionPane.showMessageDialog(null,"Voando alto !!");
    }
}

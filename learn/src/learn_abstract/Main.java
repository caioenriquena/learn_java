package learn_abstract;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("MISOO",3);
        JOptionPane.showMessageDialog(null,"Gato : " + gato1.getNome());
        gato1.correr();
        gato1.emitirSom();

        Cachorro dog = new Cachorro("Luckinho", 4);
        JOptionPane.showMessageDialog(null,"Cachorro : " + dog.getNome());
        dog.emitirSom();
        dog.correr();

        Passarinho passaro1 = new Passarinho("Bem-te-vi",2);
        JOptionPane.showMessageDialog(null,"Pássaro : " + passaro1.getNome());
        passaro1.emitirSom();
        passaro1.correr();
        passaro1.voando();
    }
}

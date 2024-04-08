package learn_abstract;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("MISOO",3);
        JOptionPane.showMessageDialog(null,"Gato");
        gato1.correr();
        gato1.emitirSom();
        JOptionPane.showMessageDialog(null,"Cachorro");
        Cachorro dog = new Cachorro("Luckinho", 4);
        dog.emitirSom();
        dog.correr();
        JOptionPane.showMessageDialog(null,"Pássaro");
        Passarinho passaro1 = new Passarinho("Bem-te-vi",2);
        passaro1.emitirSom();
        passaro1.correr();
        passaro1.voando();
    }
}

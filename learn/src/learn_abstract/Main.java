package learn_abstract;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Animal c1 = new Cachorro("Luck",20);
        c1.emitirSom();
        ((Cachorro)c1).correr();

        Animal g1 = new Gato("Misoo",20);
        g1.emitirSom();
        ((Gato)g1).correr();

        Animal p1 = new Passarinho("pau-de-arara",100);
        p1.emitirSom();
        ((Passarinho)p1).voando();






    }

}

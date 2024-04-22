package learn_abstract;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Animal c1 = new Cachorro("Luck",20, tipoAnimal.MAMIFERO);
        c1.emitirSom();
        ((Cachorro)c1).correr();

        Animal g1 = new Gato("Misoo",20, tipoAnimal.MAMIFERO);
        g1.emitirSom();
        ((Gato)g1).correr();

        Animal p1 = new Passarinho("pau-de-arara",100, tipoAnimal.AVE);
        p1.emitirSom();
        ((Passarinho)p1).voando();


        /*Exemplo 2*/

        Cachorro c2 =  new Cachorro("xauxau",20, tipoAnimal.MAMIFERO);
        Transformar t =  new Transformar();

        t.praticarCorrida(c2);
        t.fazerComer(c2);

        t.praticarVoo(new Passarinho("voavoarvou",20,tipoAnimal.AVE));
        t.
    }

}

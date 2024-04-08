package nota_de_aula_4.ex4;
public class Arara extends Animal{
    private String locomocao;
    private int qtdeOvos;

    public Arara() {
        super("Ave");
        this.locomocao = "Voo";
        this.qtdeOvos = 2;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public int getQtdeOvos() {
        return qtdeOvos;
    }
}


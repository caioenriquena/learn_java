package nota_de_aula_3.ex1;

public class Diretor extends Funcionario {


    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "O Diretor " + super.toString() + " e tem " + acoes + " ações.";
    }
}
package nota_de_aula_3.ex1;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        double bonus = (getSalario() * 0.1);
        return bonus;
    }
    public String toString() {
        return "Gerente " + super.toString() + " e responsável pelo departamento " + departamento + ", e irá receber um bônus de: R$" + calcularBonus();
    }
}
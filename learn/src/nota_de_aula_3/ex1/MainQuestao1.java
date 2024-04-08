package nota_de_aula_3.ex1;

import java.util.Scanner;
public class MainQuestao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Cadastro de Funcionários**");

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tipo de funcionário (gerente/diretor): ");
        String tipoFuncionario = scanner.next();

        if (tipoFuncionario.equalsIgnoreCase("gerente")) {
            System.out.print("Digite o departamento do gerente: ");
            String departamento = scanner.next();

            Gerente gerente = new Gerente(nome, salario, departamento);
            System.out.println("**Dados do Gerente**");
            System.out.println(gerente);
            System.out.println("Bônus: R$" + gerente.calcularBonus());
        } else if (tipoFuncionario.equalsIgnoreCase("diretor")) {
            System.out.print("Digite a quantidade de ações do diretor: ");
            int acoes = scanner.nextInt();

            Diretor diretor = new Diretor(nome, salario, acoes);
            System.out.println("**Dados do Diretor**");
            System.out.println(diretor);
        } else {
            System.out.println("Tipo de funcionário inválido!");
        }
    }
}

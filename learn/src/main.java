import javax.swing.*;

public class main {
    public static void main(String[] args) {
        /*verifica a condição e depois executa
        int idade = 0;
        while (idade <= 10) {
            System.out.println("minha idade começou de  :" + idade);
            idade ++;


        } */
        /*executa e depois verifica a condiçao
        int idade2 = 0;
        do {
            System.out.println("minha idade começou de  :" + idade2);
            idade2 ++;
        } while (idade2 <= 60);


        // exercicios com for

        // ex 1

        // Escreva um programa em Java que imprima os números de 1 a 100, um por linha.


        /for (int i = 0; i <= 100; i++) {
            System.out.println("os numeros de 1  a 100 sao : " + i);
        }

        // ex 2

        // Escreva um programa em Java que imprima os números pares de 1 a 100, um por linha.

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("os numeros pares de 1 a 100 sao :" + i);
            }
        }

        // ex 3

        // Escreva um programa em Java que imprima a soma dos números de 1 a 100.
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
            {
                System.out.println(" a soma dos valores de  1 a 100 é : " + soma);
            }
        }
        // ex 4
        // Escreva um programa em Java que imprima os números primos de 1 a 100.
        for (int i = 2; i <= 100; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);

            }
        }*/
        // entrada de dados com java OPTION PANE

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");

        System.out.println(" meu nome é : " + nome);
    }
}

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int iniJogo, finJogo, tFinal;
        iniJogo = sc.nextInt();
        finJogo = sc.nextInt();

        if(iniJogo < finJogo) {
            tFinal = finJogo-iniJogo;
        }
        else{
            tFinal = 24 - iniJogo + finJogo;
        }
        System.out.println("O jogo durou " + tFinal +  " Horas");









        sc.close();

    }
}

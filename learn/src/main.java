import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if  (N<0){
            System.out.println("NEGATIVO");

        }
        else {
            System.out.println("Positivo");
        }


        sc.close();
    }
}
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        for (int i = 0; i < n; i++) {

            int x   = sc.nextInt();

            if (x >= 10 && x <=20){
                System.out.println(x + " " + "in");
            }else {
                System.out.println(x +  " " +   "out");
            }

        }




        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double produto , quantidade;
            double total=0;

            produto = sc.nextDouble();
            quantidade = sc.nextDouble();


            if(produto==1 ){
                total = quantidade * 4.00;
            }
            else if(produto==2){
                total = quantidade * 4.50;
            } else if (produto==3) {
                total= quantidade * 5.00;
            } else if (produto==4) {
               total = quantidade * 2.00;
            } else if (produto==5) {
                total = quantidade * 1.50;
            }
            System.out.printf("Obrigado por comprar consoco o total da sua compra foi de : R$ %.2f%n " , total);

            sc.close();
        }
}


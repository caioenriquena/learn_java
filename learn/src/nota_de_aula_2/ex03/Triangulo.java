package nota_de_aula_2.ex03;

import javax.swing.*;

public class Triangulo {

    private double l1,l2,l3;


    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
    public void tipoTriangulo() {
        /*todos os lados iguais*/
        if (l1 == l2 && l1 == l3 ){
            JOptionPane.showMessageDialog(null,"Triangulo : Equilatero");
            /*todos um dos lados diferentes*/
        } else if (l1 == l2 || l2 == l3 || l1 == l3){
            JOptionPane.showMessageDialog(null,"Triangulo : Isósceles");
            /*todos lados diferentes*/
        }else{
            JOptionPane.showMessageDialog(null,"Triangulo : Escaleno");
        }

    }
}

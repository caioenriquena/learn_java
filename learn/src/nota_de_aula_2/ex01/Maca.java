package nota_de_aula_2.ex01;

import javax.swing.*;

public class Maca {
    private double m = 1.30;
    private double quantidade;

    double valor ;



    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void calcularValor(){
        if (quantidade < 12 ){
            valor = m*quantidade;
            JOptionPane.showMessageDialog(null, "O valor das maçãs foi de  : "+ valor );
        } else if (quantidade>=12) {
            valor = 1.00*quantidade;
            JOptionPane.showMessageDialog(null, "O valor das maçãs foi de  : "+ valor );
        }
    }

}
package nota_de_aula_2.ex02;

import javax.swing.*;

public class Estoque {
    private double qnt_Media;

    public double getQnt_Maxima() {
        return qnt_Maxima;
    }

    public void setQnt_Maxima(double qnt_Maxima) {
        this.qnt_Maxima = qnt_Maxima;
    }

    public double getQnt_Minima() {
        return qnt_Minima;
    }

    public void setQnt_Minima(double qnt_Minima) {
        this.qnt_Minima = qnt_Minima;
    }

    public double getQnt_Atual() {
        return qnt_Atual;
    }

    public void setQnt_Atual(double qnt_Atual) {
        this.qnt_Atual = qnt_Atual;
    }

    private double qnt_Maxima;
    private double qnt_Minima;
    private double qnt_Atual;

    public void calcula_Media(){
        qnt_Media = ((qnt_Maxima+qnt_Minima)/2);
        if (qnt_Atual> qnt_Maxima){
            JOptionPane.showMessageDialog(null, "Quantidade acima do litime no etoque, Não efetuar compra!");
        }
        else if(qnt_Media>qnt_Atual){
            JOptionPane.showMessageDialog(null, "Estoque precisa de reposição");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não efetuar compra!");
        }
    }
}

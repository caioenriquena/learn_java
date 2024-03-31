package nota_de_aula_3.ex3;

import javax.swing.*;

public class contaPoupanca extends Conta{

int selic;
double rendimento;

    public int getSelic() {
        return selic;
    }

    public void setSelic(int selic) {
        this.selic = selic;
    }

    public void taxaRendimento(){
        if (selic>8.5){
            rendimento = 0.005*saldo;
            JOptionPane.showMessageDialog(null,"Redimentos : " + rendimento);
        }else{
            rendimento = 0.007*saldo;
            JOptionPane.showMessageDialog(null,"Redimentos : " + rendimento);
        }
    }
}

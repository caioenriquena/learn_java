package nota_de_aula_4.ex4;

import javax.swing.*;

public class Leao extends Animal {
    private String locomoção;
    private String pelo;

    public Leao(String classe, String locomoção, String pelo) {
        super(classe);
        this.locomoção = locomoção;
        this.pelo = pelo;
    }
    public String getLocomocao() {
        return locomoção;
    }

    public String getPelo() {
        return pelo;
    }

    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null,"Classe :" +getClasse());
        JOptionPane.showMessageDialog(null,"Locomoção :" + locomoção);
        JOptionPane.showMessageDialog(null,"Tipo de pelo :" + pelo);
    }
}


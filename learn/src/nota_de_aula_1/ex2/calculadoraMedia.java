import javax.swing.*;

public class calculadoraMedia {

    private Double nota1,nota2,nota3,nota4,media;

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void calcularMedia() {
        media= (nota1+nota2+nota3+nota4)/4;

        if (media>=7){
            JOptionPane.showMessageDialog(null,"A media do aluno : "+ nome + " é :" + media + " Aprovado!");
        } else if (media<4) {

            JOptionPane.showMessageDialog(null,"aluno reprovado media : "+ media);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno em recuperaçao media  : "+ media);
        }

    }

}

package nota_de_aula_4.ex3;

import javax.swing.*;

public class Carro {
    String marca;
    String modelo;

    String cor = "azul";

    String tamanhoRoda = "27" ;

    int ano = 1999;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(String tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarDetalhes() {
        JOptionPane.showMessageDialog(null,"O carro tem   : " + " Cor :" + cor + " Ano : " + ano +  " Roda aro : "+ tamanhoRoda);
    }
}

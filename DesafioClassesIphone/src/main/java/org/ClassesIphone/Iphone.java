package org.ClassesIphone;

public class Iphone implements AparelhoTelefone, ReprodutorMusical, NavegadorNaInternet {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.SelecionarMusica();
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();

    }

    public void ligar() {
        System.out.println("Ligando");

    }

    public void atenter() {
        System.out.println("Atendendo");

    }

    public void IniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");

    }

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausando");
    }

    public void SelecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    public void AtualizarPagina() {
        System.out.println("Atualizando a página");

    }
}

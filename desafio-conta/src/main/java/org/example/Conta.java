package org.example;

public abstract class Conta implements Iconta {
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(){
    }
    public void depositar(){
    }

    public void transferir (){
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta ContaDestino) {

    }a
}

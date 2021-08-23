package br.ufpa;

import java.time.LocalDate;

public class Conta {
    private final int numero;
    protected Double saldo;
    private final LocalDate dataAbertura;

    public Conta(int numero, Double saldo, LocalDate dataAbertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}

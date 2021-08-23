package br.ufpa;

import java.time.LocalDate;

public abstract class ContaBancaria extends Conta {
    public ContaBancaria(int numero, Double saldo, LocalDate dataAbertura) {
        super(numero, saldo, dataAbertura);
    }

    public void creditar(Double valor) {
        try {
            if (valor <= 0) {
                throw new Exception("O valor creditado deve ser positivo!");
            }

            this.saldo += valor;
            System.out.println(
                    "Deposito de R$" + valor + " efetuado com sucesso!\n" +
                            "Saldo atual: R$" + this.getSaldo()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void debitar(Double valor) {
        try {
            if (valor <= 0) {
                throw new Exception("O valor debitado deve ser positivo!");
            }

            if (valor <= this.getSaldo()) {
                this.saldo -= valor;
                System.out.println(
                        "Saque de R$" + valor + " efetuado com sucesso!\n" +
                                "Saldo atual: R$" + this.getSaldo()
                );
            } else {
                throw new Exception(
                        "Saldo insuficiente!\n" + "Saldo atual: R$" + this.getSaldo()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void aplicarRendimentos();
}

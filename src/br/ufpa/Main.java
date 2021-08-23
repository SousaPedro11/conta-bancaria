package br.ufpa;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ContaCartaoCredito contaCartaoCredito = new ContaCartaoCredito(
                21,
                57.0,
                LocalDate.of(1985, 7, 17)
        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                32,
                450.0,
                LocalDate.of(2002, 10, 20),
                LocalDate.of(2003, 10, 20)
        );

        ContaCorrente contaCorrente = new ContaCorrente(
                37,
                50.0,
                LocalDate.of(2020, 7, 15)
        );

        contaCartaoCredito.cobrarJuros();
        contaCartaoCredito.pagar(57.114);
//        contaCartaoCredito.pagar(1.0);

        contaPoupanca.creditar(50.0);
        contaPoupanca.aplicarRendimentos();
        contaPoupanca.debitar(450.0);

        contaCorrente.creditar(55.0);
        contaCorrente.aplicarRendimentos();
        contaCorrente.debitar(45.0);
    }
}

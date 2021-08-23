package br.ufpa;

import java.time.LocalDate;

public class ContaCartaoCredito extends Conta {

    private static final Double JUROSMENSAL = 0.002;

    public ContaCartaoCredito(int numero, Double saldo, LocalDate dataAbertura) {
        super(numero, saldo, dataAbertura);
    }

    public void pagar(Double valor) {
        try {
            if (saldo <= 0) {

                throw new Exception("Conta não paga! Não há sado a ser pago!");

            }
            double pagamentoMinimo = getSaldo() * 0.1;
            if (valor < pagamentoMinimo) {
                throw new Exception("Pagamento deve ser maior ou igual a " + pagamentoMinimo + "!");
            }
            this.saldo -= valor;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cobrarJuros(Double juros) {
        try {
            if (juros <= 0) {
                throw new Exception("O valor dos juros deve positivo!");
            } else if (juros > 1) {
                juros /= 100;
            }
            double valorJuros = this.getSaldo() * juros;

            this.saldo += valorJuros;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cobrarJuros() {
        double valorJuros = this.getSaldo() * JUROSMENSAL;

        this.saldo += valorJuros;
    }
}

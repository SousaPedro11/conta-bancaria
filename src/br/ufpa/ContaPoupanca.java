package br.ufpa;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {

    private final LocalDate dataAniversario;
    private Double taxaRendimento = 0.003;

    public ContaPoupanca(int numero, Double saldo, LocalDate dataAbertura, LocalDate dataAniversario) {
        super(numero, saldo, dataAbertura);
        this.dataAniversario = dataAniversario;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        try {
            if (taxaRendimento <= 0) {
                throw new Exception("O valor da taxa deve positivo!");
            } else if (taxaRendimento > 1) {
                taxaRendimento /= 100;
            }
            this.taxaRendimento = taxaRendimento;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void aplicarRendimentos() {
        double valorRendimento = this.getSaldo() * this.getTaxaRendimento();
        this.saldo += valorRendimento;
        System.out.println("Rendimento de R$" + valorRendimento + " aplicado!\nSaldo: " + this.getSaldo());
    }
}

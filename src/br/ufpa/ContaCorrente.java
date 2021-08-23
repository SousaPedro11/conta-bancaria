package br.ufpa;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {

    private Double taxaJuros = 12.0;
    private Double limiteSaque = 10000.0;
    private Double taxaServico = 12.0;

    public ContaCorrente(int numero, Double saldo, LocalDate dataAbertura) {
        super(numero, saldo, dataAbertura);
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        try {
            if (taxaJuros <= 0) {
                throw new Exception("O valor da taxa de juros deve positivo!");
            }
            this.taxaJuros = taxaJuros;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        try {
            if (limiteSaque <= 0) {
                throw new Exception("O valor do limite de saque deve positivo!");
            }
            this.limiteSaque = limiteSaque;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Double taxaServico) {
        try {
            if (taxaServico <= 0) {
                throw new Exception("O valor da taxa de servico deve positivo!");
            }
            this.taxaServico = taxaServico;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void aplicarRendimentos() {
        double valorTaxasServicos = this.getTaxaServico() + this.getTaxaJuros();
        this.saldo -= valorTaxasServicos;
        System.out.println("Taxas no valor de R$" + valorTaxasServicos + " aplicadas com sucesso!\nSaldo: " + this.getSaldo());
    }
}

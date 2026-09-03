package projetoDesignPattern;

import java.time.LocalDate;

public abstract class Apolice {
    protected String numero;
    protected String segurado;
    protected LocalDate dataEmissao;
    protected double valorPremio;

    public abstract void calcularPremio();
    public abstract boolean validarCobertura();
    public abstract String listarDocumentos();

    public String gerarResumo() {
        return String.format(
            "Resumo da Apólice\nNúmero: %s\nSegurado: %s\nData de Emissão: %s\nPrêmio Calculado: R$ %.2f\nDocumentos Exigidos: %s\n",
            numero, segurado, dataEmissao.toString(), valorPremio, listarDocumentos()
        );
    }
}

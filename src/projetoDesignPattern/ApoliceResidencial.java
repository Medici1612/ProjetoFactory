package projetoDesignPattern;

import java.time.LocalDate;
import java.util.UUID;

public class ApoliceResidencial extends Apolice {
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;

    public ApoliceResidencial(String segurado, double valorImovel, boolean altoPadrao, boolean possuiEscrituraOuContrato) {
        this.segurado = segurado;
        this.numero = "RES-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.dataEmissao = LocalDate.now();
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

    @Override
    public void calcularPremio() {
        double premioAnual = valorImovel * 0.015;
        if (altoPadrao) {
            premioAnual *= 1.25;
        }
        this.valorPremio = premioAnual / 12.0;
    }

    @Override
    public boolean validarCobertura() {
        return possuiEscrituraOuContrato;
    }

    @Override
    public String listarDocumentos() {
        return "Escritura ou contrato de locação e comprovante de residência";
    }
}
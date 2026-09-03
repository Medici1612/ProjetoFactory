package projetoDesignPattern;

import java.time.LocalDate;
import java.util.UUID;

public class ApoliceAuto extends Apolice {
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(String segurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {
        this.segurado = segurado;
        this.numero = "AUTO-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.dataEmissao = LocalDate.now();
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public void calcularPremio() {
        double premioAnualBase = valorFipe * 0.08;
        double acrescimo = 0.0;
        if (idadeCondutor < 25) {
            acrescimo += 0.30;
        }
        if (tempoHabilitacao < 2) {
            acrescimo += 0.20;
        }
        this.valorPremio = (premioAnualBase * (1.0 + acrescimo)) / 12.0;
    }

    @Override
    public boolean validarCobertura() {
        return coberturaTerceiros >= 50000.00;
    }

    @Override
    public String listarDocumentos() {
        return "CNH, CRLV e comprovante de residência";
    }
}

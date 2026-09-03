package projetoDesignPattern;

import java.time.LocalDate;
import java.util.UUID;

public class ApoliceViagem extends Apolice {
    private int diasViagem;
    private boolean destinoInternacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public ApoliceViagem(String segurado, int diasViagem, boolean destinoInternacional, double coberturaAssistenciaMedica, boolean possuiPassaporte) {
        this.segurado = segurado;
        this.numero = "VIA-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.dataEmissao = LocalDate.now();
        this.diasViagem = diasViagem;
        this.destinoInternacional = destinoInternacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public void calcularPremio() {
        double premioBase = diasViagem * 15.00;
        if (destinoInternacional) {
            premioBase += 100.00;
        }
        this.valorPremio = premioBase;
    }

    @Override
    public boolean validarCobertura() {
        if (destinoInternacional) {
            return coberturaAssistenciaMedica >= 30000.00 && possuiPassaporte;
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        if (destinoInternacional) {
            return "Itinerário de viagem e passaporte";
        }
        return "Itinerário de viagem";
    }
}
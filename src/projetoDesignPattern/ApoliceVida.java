package projetoDesignPattern;

import java.time.LocalDate;
import java.util.UUID;

public class ApoliceVida extends Apolice {
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiAtestadoMedico;

    public ApoliceVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean possuiAtestadoMedico) {
        this.segurado = segurado;
        this.numero = "VID-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.dataEmissao = LocalDate.now();
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    public void calcularPremio() {
        double premioBase = (idade * 12.0) + (capitalSegurado * 0.002);
        if (fumante) {
            premioBase *= 1.50;
        }
        this.valorPremio = premioBase;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500000.00) {
            return possuiAtestadoMedico;
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        if (capitalSegurado > 500000.00) {
            return "Documento de identidade, CPF e atestado médico";
        }
        return "Documento de identidade e CPF";
    }
}
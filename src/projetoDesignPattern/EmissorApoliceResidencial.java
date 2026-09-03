package projetoDesignPattern;

public class EmissorApoliceResidencial extends EmissorApolice {
    private String segurado;
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;

    public EmissorApoliceResidencial(String segurado, double valorImovel, boolean altoPadrao, boolean possuiEscrituraOuContrato) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(segurado, valorImovel, altoPadrao, possuiEscrituraOuContrato);
    }
}
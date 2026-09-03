package projetoDesignPattern;

public class EmissorApoliceAuto extends EmissorApolice {
    private String segurado;
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public EmissorApoliceAuto(String segurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(segurado, valorFipe, idadeCondutor, tempoHabilitacao, coberturaTerceiros);
    }
}

package projetoDesignPattern;

public class EmissorApoliceVida extends EmissorApolice {
    private String segurado;
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiAtestadoMedico;

    public EmissorApoliceVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean possuiAtestadoMedico) {
        this.segurado = segurado;
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(segurado, idade, capitalSegurado, fumante, possuiAtestadoMedico);
    }
}

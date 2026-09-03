package projetoDesignPattern;

public class EmissorApoliceViagem extends EmissorApolice {
    private String segurado;
    private int diasViagem;
    private boolean destinoInternacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public EmissorApoliceViagem(String segurado, int diasViagem, boolean destinoInternacional, double coberturaAssistenciaMedica, boolean possuiPassaporte) {
        this.segurado = segurado;
        this.diasViagem = diasViagem;
        this.destinoInternacional = destinoInternacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceViagem(segurado, diasViagem, destinoInternacional, coberturaAssistenciaMedica, possuiPassaporte);
    }
}

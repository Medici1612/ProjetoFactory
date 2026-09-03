package projetoDesignPattern;

public abstract class EmissorApolice {
    protected abstract Apolice criarApolice();

    public final void processarContratacao() {
        Apolice apolice = criarApolice();
        if (!apolice.validarCobertura()) {
            throw new IllegalArgumentException("Contratação rejeitada: regras de cobertura ou documentação não atendidas para a apólice " + apolice.numero);
        }
        apolice.calcularPremio();
        System.out.println(apolice.gerarResumo());
    }
}

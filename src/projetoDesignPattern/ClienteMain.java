package projetoDesignPattern;

public class ClienteMain {
    public static void main(String[] args) {
        try {
            EmissorApolice emissorAuto = new EmissorApoliceAuto("Carlos Almeida", 50000.0, 23, 1, 60000.0);
            emissorAuto.processarContratacao();
            
            EmissorApolice emissorResidencial = new EmissorApoliceResidencial("Ana Costa", 800000.0, true, true);
            emissorResidencial.processarContratacao();
            
            EmissorApolice emissorVida = new EmissorApoliceVida("Roberto Santos", 40, 600000.0, false, true);
            emissorVida.processarContratacao();
            
            EmissorApolice emissorViagem = new EmissorApoliceViagem("Mariana Lima", 15, true, 50000.0, true);
            emissorViagem.processarContratacao();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
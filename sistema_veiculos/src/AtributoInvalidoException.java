//Classe usada para criar exceções com mensagens personalizadas
public class AtributoInvalidoException extends Exception {
    public AtributoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
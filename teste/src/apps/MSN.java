package apps;

public class MSN extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo MSN");
    }
}
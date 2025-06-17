package apps;

public class Facebook extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        /* usando o metodo da classe mãe, só as classes filhas precisam saber que usei esse metodo
        por isso ele é protected, ou seja ele nao esta visivel para o Main!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo Facebook");
    }
}
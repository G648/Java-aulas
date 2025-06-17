
import apps.Facebook;
import apps.MSN;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;
import java.util.Scanner;

public class Main {

    // usando o static para eu conseguir usar o Scanner no método main
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // declarando a mensagem
        ServicoMensagemInstantanea smi = null;

        System.out.println("Bem vindo ao seu computador!");

        System.out.println("Escolha um app (1- Messenger, 2- Facebook, 3- Telegram): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> smi = new MSN();
            case 2 -> smi = new Facebook();
            case 3 -> smi = new Telegram();
            default -> {
                System.out.println("Programa encerrado!");
                return;
            }
        }

        // testando os exemplos
        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistoricoMensagem();
    }

}
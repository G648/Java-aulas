package correcaoexerciciosrepeticao;

import java.util.Scanner;

public class VerificacaoSenha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha = "1234";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Informe a senha: ");

            String senhaUsuario = sc.nextLine();

            if (senhaUsuario.equals(senha)) {
                System.out.println("Senha correta! Bem vindo "
                        + "ao sistema!");

                break;
            } else {
                System.out.println("A senha está incorreta, "
                        + "tente novamente!");

                tentativas++;
            }
        }
        
        System.out.println("O limite de tentativas foi atingido!"
                + " pense um pouco na vida!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeFilmes;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaFilmes gFilme = new SistemaFilmes();

        int opcaoUsuario;

        String nomeFilme;
        String diretorFilme;
        int lancamentoFilme;
        String generoFilme;

        System.out.println("Seja bem vindo ao sistema de gerenciamento de filmes. Escolha uma opção abaixo: ");
        do {

            System.out.println("[1] - Cadastrar um novo filme");
            System.out.println("[2] - Listar filmes");
            System.out.println("[3] - Listar um filme específico");
            System.out.println("[4] - Atualizar um filme");
            System.out.println("[5] - Deletar um filme");
            System.out.println("[0] - Sair do sistema");

            opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Informe o nome do filme: ");
                    nomeFilme = sc.nextLine();

                    System.out.println("Informe o nome do diretor do filme: ");
                    diretorFilme = sc.nextLine();

                    System.out.println("Informe o ano de lançamento do filme: ");
                    lancamentoFilme = sc.nextInt();

                    System.out.println("Informe o genero do filme: ");
                    generoFilme = sc.nextLine();

                    gFilme.CadastrarFilmes(nomeFilme, diretorFilme, lancamentoFilme, generoFilme);
                    break;
                case 2:
                    gFilme.ListarFilmes();
                    break;
                case 3:
                    System.out.println("Informe o nome do filme para procurar");
                    nomeFilme = sc.nextLine();

                    gFilme.ListarFilmesPorNome(nomeFilme);
                    break;
                case 4:
                    System.out.println("Qual filme você gostaria de atualizar ?");
                    gFilme.ListarFilmes();

                    System.out.println("Informe o nome do filme antigo: ");
                    String nomeFilmeAntigo = sc.nextLine();

                    System.out.println("------------------------------------------");

                    System.out.println("Informe o novo nome do filme: ");
                    nomeFilme = sc.nextLine();

                    System.out.println("Informe o nome do diretor do filme para atualizar: ");
                    diretorFilme = sc.nextLine();

                    sc.nextLine();
                    System.out.println("Informe o ano de lançamento do filme para atualizar: ");
                    lancamentoFilme = sc.nextInt();

                    System.out.println("Informe o genero do filme para atualizar: ");
                    generoFilme = sc.nextLine();

                    gFilme.AtualizarFilmes(nomeFilmeAntigo, nomeFilme, diretorFilme, lancamentoFilme, generoFilme);
                    break;
                case 5:
                    System.out.println("Informe o nome do filme para ser removido: ");
                    gFilme.ListarFilmes();

                    nomeFilme = sc.nextLine();
                    gFilme.DeletarFilme(nomeFilme);

                    System.out.println("------------------------------------------");
                    gFilme.ListarFilmes();
                    break;
                case 0:
                    System.out.println("Até a próxima!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcaoUsuario != 0);
    }
}

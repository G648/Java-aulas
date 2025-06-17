/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayslist;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorNomes gNomes = new GerenciadorNomes();

        System.out.println("Bem vindo ao sistema de cadastro de nomes!");
        int opcaoUsuario;
        int posicao;
        String nome;

        do {
            System.out.println("[1] - Cadastro de usuario");
            System.out.println("[2] - Listagem de usuarios");
            System.out.println("[3] - Atualizar usuario");
            System.out.println("[4] - Deletar usuario");
            System.out.println("[0] - Sair do sistema");

            opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Informe o nome do usuario: ");
                    nome = sc.nextLine();

                    System.out.println("Informe a posição do usuario: ");
                    posicao = sc.nextInt();

                    gNomes.inserirUsuario(posicao, nome);
                    break;
                case 2:
                    gNomes.listarUsuario();
                    break;
                case 3:
                    gNomes.listarUsuario();

                    System.out.println("Informe a posicao: ");
                    posicao = sc.nextInt();

                    System.out.println("Informe o novo nome: ");
                    nome = sc.nextLine();

                    gNomes.atualizarUsuario(posicao, nome);
                    break;
                case 4:
                    gNomes.listarUsuario();

                    System.out.println("Informe a posicao: ");
                    posicao = sc.nextInt();

                    gNomes.deletarUsuario(posicao);
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcaoUsuario != 0);

        sc.close();
    }
}

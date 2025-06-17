package com.mycompany.sistemalivros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaLivros gLivros = new SistemaLivros();
        String nome, autor, descricao;
        int opcaoUsuario;

        do {
            System.out.println("Bem vindo ao sistema de gerencimento de livros."
                    + "Escolha uma opção abaixo: ");
            System.out.println("[1] - Cadastrar um livro");
            System.out.println("[2] - Listar todos os livros");
            System.out.println("[3] - Listar um livro");
            System.out.println("[4] - Atualizar um livro");
            System.out.println("[5] - Deletar um livro");
            System.out.println("[0] - Sair do programa");

            opcaoUsuario = sc.nextInt();
            
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Informe o nome do livro: ");
                    nome = sc.nextLine();

                    System.out.println("Informe o nome do autor: ");
                    autor = sc.nextLine();

                    System.out.println("Informe a descrição: ");
                    descricao = sc.nextLine();

                    gLivros.cadastrarLivros(nome, autor, descricao);
                    break;
                case 2:
                    System.out.println("Listagem de livros: ");
                    gLivros.listarTodosLivros();
                    break;
                case 3:
                    System.out.println("Informe o nome do livro que deseja listar: ");
                    nome = sc.nextLine();

                    gLivros.listarUnidadeLivro(nome);
                    break;
                case 4:
                    gLivros.listarTodosLivros();
                    
                    System.out.println("informe o nome do livro que você deseja atualizar?");
                    String nomeBuscado = sc.nextLine();
                    
                    System.out.println("Informe o novo nome do livro: ");
                    nome = sc.nextLine();
                    
                    System.out.println("Informe o novo autor do livro: ");
                    autor = sc.nextLine();
                    
                    System.out.println("Informe a nova descricao do livro: ");
                    descricao = sc.nextLine();
                    
                    gLivros.atualizarLivro(nomeBuscado, nome, autor, descricao);
                    break;
                case 5:
                    gLivros.listarTodosLivros();
                    
                    System.out.println("Qual livro você deseja remover ? : ");
                    nome = sc.nextLine();
                    
                    gLivros.deletarLivro(nome);
                    break;
                case 0: 
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcaoUsuario != 0);
    }
}

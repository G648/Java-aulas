/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadelistaprodutos;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class AtividadeListaProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos gProd = new metodos();

        gProd.clearScreen();
        System.out.println("Bem vindo ao sistema de cadastro de nomes!");
        int opcaoUsuario;
        int posicao;
        String nome;

        do {
            gProd.clearScreen();
            System.out.println("[1] - Cadastro de produtos");
            System.out.println("[2] - Listagem de produtos");
            System.out.println("[3] - Atualizar produtos");
            System.out.println("[4] - Deletar produtos");
            System.out.println("[0] - Sair do sistema");

            opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Informe o nome do produto: ");
                    nome = sc.nextLine();

                    System.out.println("Informe a posição do produto: ");
                    posicao = sc.nextInt();

                    gProd.CadastrarProduto(posicao, nome);
                    break;
                case 2:
                    gProd.ListarProduto();
                    break;
                case 3:
                    gProd.ListarProduto();

                    System.out.println("Informe a posicao: ");
                    posicao = sc.nextInt();

                    sc.nextLine();
                    
                    System.out.println("Informe o novo nome: ");
                    nome = sc.nextLine();

                    gProd.atualizarProduto(posicao, nome);
                    break;
                case 4:
                    gProd.ListarProduto();

                    System.out.println("Informe a posicao: ");
                    posicao = sc.nextInt();

                    gProd.deletarProduto(posicao);
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

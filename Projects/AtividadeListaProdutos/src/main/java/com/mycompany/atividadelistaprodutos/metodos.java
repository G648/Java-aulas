/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistaprodutos;

/**
 *
 * @author Guilherme Amorim
 */
public class metodos {

    String[] produtos = new String[10];

    public void CadastrarProduto(int posicao, String nome) {
        if (posicao >= 0 && posicao < produtos.length && produtos[posicao] == null) {

            produtos[posicao] = nome;
            System.out.println("produto cadastrado com sucesso!");

        } else {
            System.out.println("Nao e possivel adicionar valores / já possui valor na posição!");
        }
    }

    public void ListarProduto() {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto: " + i + " = " + produtos[i]);
        }
    }

    public void atualizarProduto(int posicao, String novoNome) {
        if (produtos[posicao] != null) {
            produtos[posicao] = novoNome;
        } else {
            System.out.println("Não foi possivel atualizar o produto! ");
        }
    }

    public void deletarProduto(int posicao) {
        if (produtos[posicao] != null) {
            produtos[posicao] = null;
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

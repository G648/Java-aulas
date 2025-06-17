/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayslist;

/**
 *
 * @author Guilherme Amorim
 */
public class GerenciadorNomes {

    String[] nomes = new String[5];

    public void inserirUsuario(int posicao, String nome) {
        if (posicao >= 0 && posicao < nomes.length) {
            nomes[posicao] = nome;
            
            System.out.println("Usuario cadastrado com sucesso!");
        }else {
            System.out.println("Nao e possivel adicionar valores!");
        }
    }
    
    public void listarUsuario() {
        for (int i = 0; i <= nomes.length; i++) {
            System.out.println("Usuario: " + i + " = " + nomes[i]);
        }
    }
    
    public void atualizarUsuario(int posicao, String novoNome) {
        if (nomes[posicao] != null) {
            nomes[posicao] = novoNome;
        } else {
            System.out.println("Não foi possivel atualizar!");
        }
    }
    
    public void deletarUsuario(int posicao) {
        if (nomes[posicao] != null) {
            nomes[posicao] = " ";
        }
    }

}

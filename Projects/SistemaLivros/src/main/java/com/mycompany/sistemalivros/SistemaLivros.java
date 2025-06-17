package com.mycompany.sistemalivros;
import java.util.ArrayList;
public class SistemaLivros {

    ArrayList<Livro> livros = new ArrayList<>();

    //Métodos de manipulação de dados
    public void cadastrarLivros(String nome, String autor, String descricao) {
        livros.add(new Livro(nome, autor, descricao));
        System.out.println("Livro cadastrado com sucesso!");
    }

    //Listar todos os livros do arrayList
    public void listarTodosLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void listarUnidadeLivro(String nomeProcurado) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nomeProcurado)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Nenhum livro com o nome: " + nomeProcurado + " foi encontrado");
    }

    public void deletarLivro(String nomeDeletado) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nomeDeletado)) {
                livros.remove(livro);
                System.out.println("O livro foi deletado com sucesso!");
                return;
            }
        }
        System.out.println("Nenhum livro encontrado!");
    }

    public void atualizarLivro(String livroBuscado, String nome, String autor, String descricao) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(livroBuscado)) {
                livro.setNome(nome);
                livro.setAutor(autor);
                livro.setDescricao(descricao);

                System.out.println("Livro foi atualizado com sucesso! ");
                return;
            }
        }

        System.out.println("Nenhum livro foi encontrado com o nome: " + livroBuscado);
    }

}

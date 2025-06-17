package AtividadeFilmes;

import java.util.ArrayList;

public class SistemaFilmes {

    private ArrayList<Filme> filmes = new ArrayList<>();

    public void CadastrarFilmes(String nome, String diretor, int anoLancamento, String genero) {
        try {
            filmes.add(new Filme(nome, diretor, anoLancamento, genero));
            System.out.println("Filme cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar filme: " + e);
        }
    }

    public void ListarFilmes() {
        try {
            for (Filme filme : filmes) {
                if (filmes.isEmpty()) {
                    System.out.println("Nenhum filme cadastrado!");
                } else {
                    System.out.println(filme);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar filmes: " + e);
        }
    }

    public void ListarFilmesPorNome(String nome) {
        try {
            for (Filme filme : filmes) {
                if (filmes.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado");
                } else if (filme.getNomeFilme().equalsIgnoreCase(nome)) {
                    System.out.println("Listagem: " + filme);
                } else{
                    System.out.println("Nenhum filme com o nome: " + nome);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar nome do filme: " + e);
        }
    }

    public void AtualizarFilmes(String nomeFilmeAntigo, String nome, String diretor, int anoLancamento, String genero) {
        try {
            //percorrendo a lista de filmes para verificar se o nome do filme está presente na lista
            for (Filme filme : filmes) {
                if (filme.getNomeFilme().equalsIgnoreCase(nomeFilmeAntigo)) {
                    filme.setNomeFilme(nome);
                    filme.setDiretorFilme(diretor);
                    filme.setAnoLancamentoFilme(anoLancamento);
                    filme.setGeneroFilme(genero);
                    System.out.println("Filme Atualizado com sucesso!");
                    return;
                }

                System.out.println("Filme não encontrado");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível atualizar o Filme: " + e);
        }
    }

    public void DeletarFilme(String nomeFilme) {
        try {
            for (Filme filme : filmes) {
                if (filme.getNomeFilme().equalsIgnoreCase(nomeFilme)) {
                    filmes.remove(filme);
                    System.out.println("Filme removido com sucesso!");
                    return;
                } else {
                    System.out.println("Nenhum filme encontrado");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar um filme: " + e);
        }
    }
}

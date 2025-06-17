package AtividadeLivros;
import java.util.ArrayList;

public class SistemaLivraria {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String nome, String autor, String descricao) {
        livros.add(new Livro(nome, autor, descricao));
        System.out.println("Livro cadastrado com sucesso.");
    }

    public void atualizarLivro(String nome, String novoAutor, String novaDescricao) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                livro.setAutor(novoAutor);
                livro.setDescricao(novaDescricao);
                System.out.println("Livro atualizado.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void visualizarTodosLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void deletarLivro(String nome) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                livros.remove(livro);
                System.out.println("Livro removido.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void visualizarLivro(String nome) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

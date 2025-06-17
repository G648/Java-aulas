// Define o pacote onde essa classe está localizada
package AtividadeLivros;

// Declaração da classe Livro, que representa um livro com nome, autor e descrição
public class Livro {

    // Atributos privados da classe: só podem ser acessados por métodos da própria classe
    private String nome;
    private String autor;
    private String descricao;

    // Construtor da classe: chamado quando um novo objeto Livro é criado
    // Ele inicializa os atributos com os valores passados como parâmetros
    public Livro(String nome, String autor, String descricao) {
        this.nome = nome;               // "this.nome" refere-se ao atributo da classe
        this.autor = autor;
        this.descricao = descricao;
    }

    // Métodos getters: permitem ler o valor de um atributo de forma segura
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }

    // Métodos setters: permitem alterar (atualizar) os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método toString sobrescrito: define como o objeto será representado em forma de texto
    // Útil para imprimir o objeto diretamente (ex: System.out.println(livro))
    @Override
    public String toString() {
        return "Livro{"                         // Texto inicial da representação
                + "nome='" + nome + '\''        // Concatena o nome
                + ", autor='" + autor + '\''    // Concatena o autor
                + ", descricao='" + descricao + '\'' // Concatena a descrição
                + '}';                          // Fecha a representação
    }
}

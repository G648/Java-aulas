package AtividadeLivros;

public class Main {

    public static void main(String[] args) {

        SistemaLivraria sistema = new SistemaLivraria();

        sistema.cadastrarLivro("1984", "George Orwell", "Distopia política");
        sistema.visualizarTodosLivros();
        sistema.visualizarLivro("1984");

        sistema.atualizarLivro("1984", "G. Orwell", "Nova descrição");
        sistema.visualizarLivro("1984");

        sistema.deletarLivro("1984");
        sistema.visualizarTodosLivros();
    }
}

import Dao.ILivroDao;
import Dao.IUsuarioDao;
import DaoImpl.LivroImpl;
import DaoImpl.UsuarioImpl;
import Model.Livro;
import Model.Usuario;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IUsuarioDao usuarioDao = new UsuarioImpl();
        ILivroDao livroDao = new LivroImpl();

        int opcao;

        do {
            System.out.println("\n📚 MENU PRINCIPAL - SISTEMA BIBLIOTECA");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Buscar usuário por ID");
            System.out.println("4. Deletar usuário");
            System.out.println("5. Cadastrar livro");
            System.out.println("6. Listar livros");
            System.out.println("7. Buscar livro por ID");
            System.out.println("8. Deletar livro");
            System.out.println("9. Listar livros de um usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> {
                    Usuario u = new Usuario();
                    System.out.print("Nome: ");
                    u.setNomeUsuario(sc.nextLine());
                    System.out.print("Endereço: ");
                    u.setEnderecoUsuario(sc.nextLine());
                    System.out.print("Telefone: ");
                    u.setTelefoneUsuario(sc.nextLine());
                    usuarioDao.registerUser(u);
                }
                case 2 -> {
                    List<Usuario> usuarios = usuarioDao.getAllUsers();
                    usuarios.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Digite o ID do usuário: ");
                    long id = sc.nextLong();
                    Usuario usuario = new Usuario();
                    usuario.setIdUsuario(id);
                    Usuario encontrado = usuarioDao.getUserById(usuario);
                    System.out.println(encontrado != null ? encontrado : "Usuário não encontrado.");
                }
                case 4 -> {
                    System.out.print("Digite o ID do usuário a deletar: ");
                    long id = sc.nextLong();
                    Usuario u = new Usuario();
                    u.setIdUsuario(id);
                    usuarioDao.deleteUser(u);
                    System.out.println("Usuário deletado!");
                }
                case 5 -> {
                    Livro l = new Livro();
                    System.out.print("Nome do livro: ");
                    l.setNomeLivro(sc.nextLine());
                    System.out.print("Autor: ");
                    l.setAutorLivro(sc.nextLine());
                    System.out.print("Editora: ");
                    l.setEditoraLivro(sc.nextLine());
                    System.out.print("ID do usuário (emprestado para): ");
                    l.setIdUsuario(sc.nextLong());
                    livroDao.createBook(l);
                    System.out.println("Livro cadastrado!");
                }
                case 6 -> {
                    List<Livro> livros = livroDao.getAllBooks();
                    livros.forEach(System.out::println);
                }
                case 7 -> {
                    System.out.print("Digite o ID do livro: ");
                    int id = sc.nextInt();
                    Livro livro = livroDao.getBookById(id);
                    System.out.println(livro != null ? livro : "Livro não encontrado.");
                }
                case 8 -> {
                    System.out.print("Digite o ID do livro a deletar: ");
                    int id = sc.nextInt();
                    livroDao.deleteBook(id);
                    System.out.println("Livro deletado!");
                }
                case 9 -> {
                    System.out.print("Digite o ID do usuário: ");
                    long idUsuario = sc.nextLong();
                    List<Livro> livros = livroDao.getBooksByUserId(idUsuario);
                    System.out.println("📚 Livros do usuário ID " + idUsuario + ":");
                    livros.forEach(System.out::println);
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

package Dao;

import Model.Livro;
import Model.Usuario;

import java.util.List;

public interface ILivroDao {

    //Listar todos os livros
    public List<Livro> getAllBooks();

    //Listar livro por id
    public Livro getBookById(int id);

    //Cadastrar um livro
    public void createBook(Livro livro);

    //Deletar um livro
    public void deleteBook(int id);

    //Atualizar um livro
    public void updateBook(Livro livro);

    // Buscar livros por nome (com LIKE ou igual)
    List<Livro> getBooksByName(String name);

    // Buscar todos os livros de um determinado usuário (emprestados)
    List<Livro> getBooksByUserId(long idUsuario);
}

package Dao;

import Model.Livro;
import Model.Usuario;

import java.util.List;

public interface IUsuarioDao {
    //Listar todos os usuários
    public List<Usuario> getAllUsers();

    //retornar usuário por ID
    public Usuario getUserById(Usuario usuario);

    //Cadastrar usuário
    public void registerUser(Usuario usuario);

    //Deletar usuário
    public void deleteUser(Usuario usuario);

    //Atualizar usuário
    public void updateUser(Usuario usuario);
}

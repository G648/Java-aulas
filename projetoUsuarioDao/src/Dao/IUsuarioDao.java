package Dao;

import Model.Usuario;
import java.util.List;

public interface IUsuarioDao {
    //listar
    public List<Usuario> getAllUsers();

    //listar por id
    public Usuario getUserById(int id);

    //Cadastrar usuario
    public void registerNewUser(Usuario usuario);

    //deletar usuario
    public void deleteUser(int id);

    //atualizar usuario
    public void updateUser(Usuario usuario);
}

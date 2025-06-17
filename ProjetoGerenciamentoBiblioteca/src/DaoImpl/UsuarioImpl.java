package DaoImpl;

import Dao.IUsuarioDao;
import Database.SqlConnection;
import Model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioImpl implements IUsuarioDao {

    private final Connection conn;

    public UsuarioImpl() {
        try {
            conn = SqlConnection.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados." + e);
        }
    }

    @Override
    public List<Usuario> getAllUsers() {
        List<Usuario> usuarios = new ArrayList<>();


        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from usuarios");

            while (resultSet.next()) {
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(resultSet.getLong("idUsuario"));
                usuario.setNomeUsuario(resultSet.getString("nomeUsuario"));
                usuario.setEnderecoUsuario(resultSet.getString("enderecoUsuario"));
                usuario.setTelefoneUsuario(resultSet.getString("telefoneUsuario"));

                usuarios.add(usuario);
            }

            if (usuarios.isEmpty()) {
                System.out.println("Nenhum usuario encontrado!");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar usuário: " + e);
        }

        return usuarios;
    }

    @Override
    public Usuario getUserById(Usuario usuario) {
        String sql = "select * from usuarios where idUsuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setLong(1, usuario.getIdUsuario());
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                Usuario user = new Usuario();
                user.setIdUsuario(resultSet.getLong("idUsuario"));
                user.setNomeUsuario(resultSet.getString("nomeUsuario"));
                user.setEnderecoUsuario(resultSet.getString("enderecoUsuario"));
                user.setTelefoneUsuario(resultSet.getString("telefoneUsuario"));

                return user;
            } else {
                System.out.println("Nenhum usuario encontrado!");
                return null;
            }


        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar usuário por ID: " + e);
        }
    }

    @Override
    public void registerUser(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nomeUsuario, enderecoUsuario, telefoneUsuario) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEnderecoUsuario());
            stmt.setString(3, usuario.getTelefoneUsuario());
            stmt.executeUpdate();

            System.out.println("Usuario cadastrado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar usuário: " + e);
        }
    }

    @Override
    public void deleteUser(Usuario usuario) {
        String sql = "DELETE FROM usuarios WHERE idUsuario = ?";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setLong(1, usuario.getIdUsuario());
            statement.executeUpdate();

            System.out.println("Usuario deletado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar usuário: " + e);
        }
    }

    @Override
    public void updateUser(Usuario usuario) {

    }
}

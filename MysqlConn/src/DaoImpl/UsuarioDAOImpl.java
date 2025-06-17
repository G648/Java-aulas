package DaoImpl;

import Dao.IUsuarioDAO;
import Database.MysqlConnection;
import Model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {
    private Connection conn;

    public UsuarioDAOImpl() {
        try {
            conn = MysqlConnection.conectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Usuario> getAllusers() {
        List<Usuario> usuarios = new ArrayList<>();

        try {
            //Criação do estado da query
            Statement statement = conn.createStatement();
            //o que é o resultset????
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            while (resultSet.next()) {
                //trabalhando com query params
                Usuario usuario = new Usuario();
                //passando o atributo (coluna do banco de dados)
                usuario.setIdUsuario(resultSet.getInt("idusuario"));
                usuario.setNomeUsuario(resultSet.getString("nomeUsuario"));
                usuario.setIdadeUsuario(resultSet.getInt("idadeUsuario"));
                usuarios.add(usuario);
            }

            if (usuarios.isEmpty()) {
                System.out.println("Nenhum usuário está cadastrado!");
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException("Erro ao listar todos os usuários: " + e);
        }

        return usuarios;
    }

    @Override
    public Usuario getUserById(int id) {
        String sql = "SELECT * FROM usuarios WHERE idUsuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);  // define o valor do parâmetro na query
            ResultSet resultSet = stmt.executeQuery();  // executa a consulta

            if (resultSet.next()) {
                // se encontrou um usuário com o ID fornecido
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNomeUsuario(resultSet.getString("nomeUsuario"));
                usuario.setIdadeUsuario(resultSet.getInt("idadeUsuario"));

                return usuario;
            } else {
                // se não encontrou nenhum usuário com esse ID
                System.out.println("Usuário não encontrado.");
                return null;
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar usuário por ID: " + e.getMessage(), e);
        }
    }


    @Override
    public void registerNewUser(Usuario usuario) {
        String sql = "INSERT INTO usuarios(nomeUsuario, idadeUsuario) VALUES(?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setInt(2, usuario.getIdadeUsuario());

            stmt.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");

        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao cadastrar um usuário: " + e);
        }
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateuser(Usuario usuario) {

    }
}

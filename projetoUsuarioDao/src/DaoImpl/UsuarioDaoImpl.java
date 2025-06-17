package DaoImpl;

import Dao.IUsuarioDao;
import Database.MysqlConnection;
import Model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements IUsuarioDao {
    private final Connection conn;

    public UsuarioDaoImpl() {
        try {
            conn = MysqlConnection.conectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Usuario> getAllUsers() {
        // armazenar os usuários retornados do banco dados
        List<Usuario> usuarios = new ArrayList<>();

        try {
            //Cria o estado para executar a consulta SQL
            Statement stmt = conn.createStatement();

            //Executa a consulta e armazena o resultado em um ResultSet
            //ResultSet representa uma tabela temporária em memória, com os dados retornados da consulta
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM usuarios");

            while (resultSet.next()) {
                //Criar um novo objeto usuario
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNomeUsuario(resultSet.getString("NomeUsuario"));
                usuario.setIdadeUsuario(resultSet.getInt("idadeUsuario"));

                usuarios.add(usuario);
            }

            if (usuarios.isEmpty()) {
                System.out.println("Nenhum usuário está cadastrado no sistema!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return usuarios;
    }

    @Override
    public Usuario getUserById(int id) {
        //SQL PARAMMS
        String sql = "SELECT * FROM usuarios WHERE idUsuario = ?"; //? = parametro da query

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id); //define o valor do parâmetro na query
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(resultSet.getInt("idusuario"));
                usuario.setNomeUsuario(resultSet.getString("nomeUsuario"));
                usuario.setIdadeUsuario(resultSet.getInt("idadeUsuario"));

                return usuario;
            } else {
                System.out.println("Nenhum usuário foi encontrado!");
                return null;
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar usuário por ID" + e.getMessage());
        }
    }

    @Override
    public void registerNewUser(Usuario usuario) {
        //SQL paramms
        String sql = "INSERT INTO usuarios(nomeUsuario, idadeUsuario) VALUES (?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setInt(2, usuario.getIdadeUsuario());

            stmt.executeUpdate();

            System.out.println("Usuário foi cadastrado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar um usuário: " + e.getMessage());
        }
    }

    @Override
    public void deleteUser(int id) {
        // primeiro passo -> sql
        String sql = "DELETE FROM usuarios WHERE idUsuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Usuário deletado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar usuário: " + e.getMessage());
        }
    }

    @Override
    public void updateUser(Usuario usuario) {
        String sql = "UPDATE usuarios SET nomeUsuario = ?, idadeUsuario = ? WHERE idUsuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setInt(2, usuario.getIdadeUsuario());
            stmt.setInt(3, usuario.getIdUsuario());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário atualizado com sucesso: ");
                System.out.println(usuario);
            } else {
                System.out.println("nenhum usuário encontrado com o id: " + usuario.getIdUsuario());
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar usuário: " + e.getMessage());
        }
    }
}

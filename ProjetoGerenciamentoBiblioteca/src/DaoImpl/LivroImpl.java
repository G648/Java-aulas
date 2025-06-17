package DaoImpl;

import Dao.ILivroDao;
import Model.Livro;
import Database.SqlConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroImpl implements ILivroDao {
    private Connection conn;

    public LivroImpl() {
        try {
            conn = SqlConnection.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados." + e);
        }
    }

    @Override
    public List<Livro> getAllBooks() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = mapResultSetToLivro(rs);
                livros.add(livro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livros;
    }

    @Override
    public Livro getBookById(int id) {
        String sql = "SELECT * FROM livros WHERE idLivro = ?";
        Livro livro = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                livro = mapResultSetToLivro(rs);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livro;
    }

    @Override
    public void createBook(Livro livro) {
        String sql = "INSERT INTO livros (nomeLivro, autorLivro, editoraLivro, idUsuario) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getAutorLivro());
            stmt.setString(3, livro.getEditoraLivro());

            if (livro.getIdUsuario() != null) {
                stmt.setLong(4, livro.getIdUsuario());
            } else {
                stmt.setNull(4, Types.BIGINT);
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int id) {
        String sql = "DELETE FROM livros WHERE idLivro = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(Livro livro) {
        String sql = "UPDATE livros SET nomeLivro = ?, autorLivro = ?, editoraLivro = ?, idUsuario = ? WHERE idLivro = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getAutorLivro());
            stmt.setString(3, livro.getEditoraLivro());

            if (livro.getIdUsuario() != null) {
                stmt.setLong(4, livro.getIdUsuario());
            } else {
                stmt.setNull(4, Types.BIGINT);
            }

            stmt.setLong(5, livro.getIdLivro());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Livro> getBooksByName(String name) {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros WHERE nomeLivro LIKE ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Livro livro = mapResultSetToLivro(rs);
                livros.add(livro);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livros;
    }

    @Override
    public List<Livro> getBooksByUserId(long idUsuario) {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros WHERE idUsuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, idUsuario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Livro livro = mapResultSetToLivro(rs);
                livros.add(livro);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livros;
    }

    private Livro mapResultSetToLivro(ResultSet rs) throws SQLException {
        Livro livro = new Livro();
        livro.setIdLivro(rs.getLong("idLivro"));
        livro.setNomeLivro(rs.getString("nomeLivro"));
        livro.setAutorLivro(rs.getString("autorLivro"));
        livro.setEditoraLivro(rs.getString("editoraLivro"));
        long idUsuario = rs.getLong("idUsuario");
        if (!rs.wasNull()) {
            livro.setIdUsuario(idUsuario);
        } else {
            livro.setIdUsuario(null);
        }
        return livro;
    }
}

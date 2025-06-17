package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    private static final String url = "jdbc:mysql://localhost:3306/sistemaBiblioteca?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "Senai@134";

    //método de conexão
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

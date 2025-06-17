package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

    private static final String url = "jdbc:mysql://localhost:3306/teste?useSSL=false&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String senha = "Senai@134";


    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}

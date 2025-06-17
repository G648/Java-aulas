import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/ivo?useSSL=false&serverTimeZone=UTC";
         String usuario = "root";
         String senha = "Senai@134";

         try {
             Connection conn = DriverManager.getConnection(url, usuario, senha);
             System.out.println("Conectado com sucesso ao banco de dados");
             conn.close();
         } catch (SQLException e) {
             System.out.println("Erro de conexão: " + e.getMessage());
         }
    }
}

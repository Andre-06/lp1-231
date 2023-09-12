package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    // JDBC - Java DataBase Conection
    // Conjunto de interface e classes para acesso as SGBDs
    // Java App ---> JDBC -> DRIVER (Bilbioteca que )
    public static void main(String[] args) throws SQLException {
        // 1 - Abrir a conexão
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ativo BOOL);";
        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        stmt.close();
        connection.close();

    }
}

package semana22;

import java.sql.*;

public class ListarAlunos {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        String sql = "SELECT * FROM alunos;";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("_________________________________________________________________________________");
        System.out.println("ID | NOME | EMAIL | ATIVO");
        while (rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");
            System.out.println(id + " | " + nome + " | " + email + " | " + ativo );
        }

        stmt.close();
        connection.close();
    }
}

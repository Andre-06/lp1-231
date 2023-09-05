package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira o email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO aluninhos VALUES (?, ?, ?, ?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, true);
        
        pstm.executeUpdate();

        pstm.close();
        connection.close();
    }
    
}

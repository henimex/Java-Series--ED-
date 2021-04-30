package hendev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void ShowErrorMessage(SQLException exception) {
        System.out.println("MySql Error-----------------------------");
        System.out.println("Error Message \t: " + exception.getMessage());
        System.out.println("Error Code \t\t: " + exception.getErrorCode());
        System.out.println("Detailed Error Message -----------------");
        exception.printStackTrace();
    }
}

package hendev.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {
        System.out.println("JDBC Usage");

        SetConnection();
    }

    private static void SetConnection() {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        try {
            connection = helper.getConnection();
            System.out.println("DB Connection Successful");
        } catch (SQLException exception) {
            helper.ShowErrorMessage(exception);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException exception) {
                System.out.println("Final Initialized");
                helper.ShowErrorMessage(exception);
            }
        }
    }
}

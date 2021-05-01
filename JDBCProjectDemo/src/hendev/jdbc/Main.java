package hendev.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("JDBC Usage");
        String query1 = "SELECT Code,Name,Continent,Region FROM country";
        String query2 = "INSERT INTO country (Code, Name, Continent, Region) VALUES ('JHX', 'MexLand', 'Europe', 'EU-West')";

        SetConnection(query1);
        InsertData(query2);

        //I Passed Update and Delete Operations Because i wish like to focus on real world projects. if needed i could find Crud operations anytime.
    }

    private static void InsertData(String query) {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            System.out.println("DB Connection Successful");
            statement = connection.prepareStatement(query);
            int result = statement.executeUpdate();
            System.out.println("Effected Row \t:  " + result);
        } catch (SQLException exception) {
            helper.ShowErrorMessage(exception);
        } finally {
            try {
                if (connection != null && statement != null) {
                    statement.close();
                    connection.close();
                }
            } catch (SQLException exception) {
                System.out.println("Final Initialized");
                helper.ShowErrorMessage(exception);
            }
        }
    }

    private static void SetConnection(String query) {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            System.out.println("DB Connection Successful");

            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
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
